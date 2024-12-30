package com.allinone.controller;

import com.allinone.domain.WarehouseLocation;
import com.allinone.service.IWarehouseLocationService;
import com.allinone.util.Result;
import com.allinone.util.ResultCode;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;

import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.function.Supplier;

/**
 * 库位控制器，用于管理库位相关的增删改查操作。
 *
 * @author wangzm
 * @since 2024-12-23
 */
@RestController
@RequestMapping("/warehouseLocation")
public class WarehouseLocationController {
    private final IWarehouseLocationService warehouseLocationService;
    private static final Logger logger = LoggerFactory.getLogger(WarehouseLocationController.class);
    
    public WarehouseLocationController(IWarehouseLocationService warehouseLocationService) {
        this.warehouseLocationService = warehouseLocationService;
    }
    
    /**
     * 获取所有库位信息列表。
     *
     * @return 包含库位信息的结果对象
     */
    @PostMapping("/list")
    public Result list() {
        return handleResult(warehouseLocationService::list);
    }
    
    /**
     * 根据ID获取库位信息。
     *
     * @param id 库位ID
     * @return 包含库位信息的结果对象
     */
    @PostMapping("/getById")
    public Result getById(@RequestParam Integer id) {
        return handleResult(() -> {
            WarehouseLocation warehouseLocation = warehouseLocationService.getById(id);
            if (warehouseLocation == null) {
                throw new RuntimeException("Warehouse location not found with id: " + id);
            }
            return warehouseLocation;
        });
    }
    
    /**
     * 添加新的库位信息。
     *
     * @param warehouseLocation 新的库位信息对象
     * @return 操作结果
     */
    @PostMapping("/add")
    public Result add(@Valid @RequestBody WarehouseLocation warehouseLocation) {
        return handleResult(() -> {
            QueryWrapper<WarehouseLocation> queryWrapper = new QueryWrapper<>();
            queryWrapper.eq("location", warehouseLocation.getLocation());
            if (warehouseLocationService.getOne(queryWrapper, false) != null) {
                throw new RuntimeException("Warehouse location already exists with location: " + warehouseLocation.getLocation());
            }
            if (!warehouseLocationService.save(warehouseLocation)) {
                throw new RuntimeException("Failed to add warehouse location: " + warehouseLocation);
            }
            return null;
        });
    }
    
    /**
     * 根据ID更新库位信息。
     *
     * @param warehouseLocation 更新后的库位信息对象
     * @return 操作结果
     */
    @PostMapping("/updateById")
    public Result updateById(@Valid @RequestBody WarehouseLocation warehouseLocation) {
        return handleResult(() -> {
            if (!warehouseLocationService.updateById(warehouseLocation)) {
                throw new RuntimeException("Failed to update warehouse location: " + warehouseLocation);
            }
            return null;
        });
    }
    
    /**
     * 根据ID删除库位信息。
     *
     * @param id 库位ID
     * @return 操作结果
     */
    @PostMapping("/deleteById")
    public Result deleteById(@RequestParam Integer id) {
        return handleResult(() -> {
            if (!warehouseLocationService.removeById(id)) {
                throw new RuntimeException("Failed to delete warehouse location with id: " + id);
            }
            return null;
        });
    }
    
    /**
     * 处理结果并设置结果对象。
     *
     * @param supplier 结果提供者
     * @return 结果对象
     */
    private Result handleResult(Supplier<Object> supplier) {
        try {
            Object data = supplier.get();
            return new Result(ResultCode.SUCCESS.getCode(), ResultCode.SUCCESS.getMsg(), data);
        } catch (Exception e) {
            logger.error("Error processing request: {}", e.getMessage(), e);
            return new Result(ResultCode.INTERNAL_ERROR.getCode(), e.getMessage(), null);
        }
    }
}
