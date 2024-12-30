package com.allinone.domain;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * <p>
 * 库位实体
 * </p>
 *
 * @author wangzm
 * @since 2024-12-23
 */

@TableName("WAREHOUSE_LOCATION")
public class WarehouseLocation implements Serializable {
    
    @Serial
    private static final long serialVersionUID = 1L;
    
    @TableId(value = "ID", type = IdType.AUTO)
    private Integer id;
    
    @TableField("Location")
    private String location;
    
    @TableField("Facility")
    private String facility;
    
    @TableField("Warehouse")
    private String warehouse;
    
    @TableField("WarehouseLocationType")
    private Short warehouseLocationType;
    
    @TableField("Zone")
    private String zone;
    
    @TableField("StorageBin")
    private String storageBin;
    
    @TableField("WalkPath")
    private Integer walkPath;
    
    @TableField("AllocationPath")
    private Integer allocationPath;
    
    @TableField("FillPath")
    private Integer fillPath;
    
    @TableField("XCoordinate1")
    private BigDecimal xCoordinate1;
    
    @TableField("YCoordinate1")
    private BigDecimal yCoordinate1;
    
    @TableField("ZCoordinate1")
    private BigDecimal zCoordinate1;
    
    @TableField("UomCodeXCoordinate1")
    private String uomCodeXCoordinate1;
    
    @TableField("UomCodeYCoordinate1")
    private String uomCodeYCoordinate1;
    
    @TableField("UomCodeZCoordinate1")
    private String uomCodeZCoordinate1;
    
    @TableField("MapID1")
    private Integer mapID1;
    
    @TableField("XCoordinate2")
    private BigDecimal xCoordinate2;
    
    @TableField("YCoordinate2")
    private BigDecimal yCoordinate2;
    
    @TableField("ZCoordinate2")
    private BigDecimal zCoordinate2;
    
    @TableField("UomCodeXCoordinate2")
    private String uomCodeXCoordinate2;
    
    @TableField("UomCodeYCoordinate2")
    private String uomCodeYCoordinate2;
    
    @TableField("UomCodeZCoordinate2")
    private String uomCodeZCoordinate2;
    
    @TableField("MapID2")
    private Integer mapID2;
    
    @TableField("OALocatorID")
    private Integer oALocatorID;
    
    @TableField("TextID")
    private Integer textID;
    
    @TableField("Department")
    private String department;
    
    @TableField("CalendarID")
    private Integer calendarID;
    
    @TableField("MobilityID")
    private Integer mobilityID;
    
    @TableField("OwnershipID")
    private Integer ownershipID;
    
    @TableField("UnitID")
    private Integer unitID;
    
    @TableField("SpecificationID")
    private Integer specificationID;
    
    @TableField("Aisle")
    private String aisle;
    
    @TableField("Row_")
    private String row;
    
    @TableField("Tier")
    private String tier;
    
    @TableField("WorkCenter")
    private String workCenter;
    
    @TableField("WarehouseLocationClassID")
    private Integer warehouseLocationClassID;
    
    @TableField("CurrentWeightUtilization")
    private BigDecimal currentWeightUtilization;
    
    @TableField("CurrentSpaceUtilization")
    private BigDecimal currentSpaceUtilization;
    
    @TableField("ReferenceID")
    private Integer referenceID;
    
    @TableField("LastUpdateOn")
    private LocalDateTime lastUpdateOn;
    
    @TableField("LastUpdatedBy")
    private String lastUpdatedBy;
    
    @TableField("CreatedOn")
    private LocalDateTime createdOn;
    
    @TableField("CreatedBy")
    private String createdBy;
    
    @TableField("Active")
    private Boolean active;
    
    @TableField("LastDeleteOn")
    private LocalDateTime lastDeleteOn;
    
    @TableField("LastDeletedBy")
    private String lastDeletedBy;
    
    @TableField("LastReactivateOn")
    private LocalDateTime lastReactivateOn;
    
    @TableField("LastReactivatedBy")
    private String lastReactivatedBy;
    
    @TableField("ArchiveID")
    private Integer archiveID;
    
    @TableField("LastArchiveOn")
    private LocalDateTime lastArchiveOn;
    
    @TableField("LastArchivedBy")
    private String lastArchivedBy;
    
    @TableField("LastRestoreOn")
    private LocalDateTime lastRestoreOn;
    
    @TableField("LastRestoredBy")
    private String lastRestoredBy;
    
    @TableField("RowVersionStamp")
    private Integer rowVersionStamp;
    
    @TableField("ControlNo")
    private String controlNo;
    
    @TableField("DSID")
    private String dsid;
    
    @TableField("DSName")
    private String dSName;
    
    public Integer getId() {
        return id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    public String getLocation() {
        return location;
    }
    
    public void setLocation(String location) {
        this.location = location;
    }
    
    public String getFacility() {
        return facility;
    }
    
    public void setFacility(String facility) {
        this.facility = facility;
    }
    
    public String getWarehouse() {
        return warehouse;
    }
    
    public void setWarehouse(String warehouse) {
        this.warehouse = warehouse;
    }
    
    public Short getWarehouseLocationType() {
        return warehouseLocationType;
    }
    
    public void setWarehouseLocationType(Short warehouseLocationType) {
        this.warehouseLocationType = warehouseLocationType;
    }
    
    public String getZone() {
        return zone;
    }
    
    public void setZone(String zone) {
        this.zone = zone;
    }
    
    public String getStorageBin() {
        return storageBin;
    }
    
    public void setStorageBin(String storageBin) {
        this.storageBin = storageBin;
    }
    
    public Integer getWalkPath() {
        return walkPath;
    }
    
    public void setWalkPath(Integer walkPath) {
        this.walkPath = walkPath;
    }
    
    public Integer getAllocationPath() {
        return allocationPath;
    }
    
    public void setAllocationPath(Integer allocationPath) {
        this.allocationPath = allocationPath;
    }
    
    public Integer getFillPath() {
        return fillPath;
    }
    
    public void setFillPath(Integer fillPath) {
        this.fillPath = fillPath;
    }
    
    public BigDecimal getxCoordinate1() {
        return xCoordinate1;
    }
    
    public void setxCoordinate1(BigDecimal xCoordinate1) {
        this.xCoordinate1 = xCoordinate1;
    }
    
    public BigDecimal getyCoordinate1() {
        return yCoordinate1;
    }
    
    public void setyCoordinate1(BigDecimal yCoordinate1) {
        this.yCoordinate1 = yCoordinate1;
    }
    
    public BigDecimal getzCoordinate1() {
        return zCoordinate1;
    }
    
    public void setzCoordinate1(BigDecimal zCoordinate1) {
        this.zCoordinate1 = zCoordinate1;
    }
    
    public String getUomCodeXCoordinate1() {
        return uomCodeXCoordinate1;
    }
    
    public void setUomCodeXCoordinate1(String uomCodeXCoordinate1) {
        this.uomCodeXCoordinate1 = uomCodeXCoordinate1;
    }
    
    public String getUomCodeYCoordinate1() {
        return uomCodeYCoordinate1;
    }
    
    public void setUomCodeYCoordinate1(String uomCodeYCoordinate1) {
        this.uomCodeYCoordinate1 = uomCodeYCoordinate1;
    }
    
    public String getUomCodeZCoordinate1() {
        return uomCodeZCoordinate1;
    }
    
    public void setUomCodeZCoordinate1(String uomCodeZCoordinate1) {
        this.uomCodeZCoordinate1 = uomCodeZCoordinate1;
    }
    
    public Integer getMapID1() {
        return mapID1;
    }
    
    public void setMapID1(Integer mapID1) {
        this.mapID1 = mapID1;
    }
    
    public BigDecimal getxCoordinate2() {
        return xCoordinate2;
    }
    
    public void setxCoordinate2(BigDecimal xCoordinate2) {
        this.xCoordinate2 = xCoordinate2;
    }
    
    public BigDecimal getyCoordinate2() {
        return yCoordinate2;
    }
    
    public void setyCoordinate2(BigDecimal yCoordinate2) {
        this.yCoordinate2 = yCoordinate2;
    }
    
    public BigDecimal getzCoordinate2() {
        return zCoordinate2;
    }
    
    public void setzCoordinate2(BigDecimal zCoordinate2) {
        this.zCoordinate2 = zCoordinate2;
    }
    
    public String getUomCodeXCoordinate2() {
        return uomCodeXCoordinate2;
    }
    
    public void setUomCodeXCoordinate2(String uomCodeXCoordinate2) {
        this.uomCodeXCoordinate2 = uomCodeXCoordinate2;
    }
    
    public String getUomCodeYCoordinate2() {
        return uomCodeYCoordinate2;
    }
    
    public void setUomCodeYCoordinate2(String uomCodeYCoordinate2) {
        this.uomCodeYCoordinate2 = uomCodeYCoordinate2;
    }
    
    public String getUomCodeZCoordinate2() {
        return uomCodeZCoordinate2;
    }
    
    public void setUomCodeZCoordinate2(String uomCodeZCoordinate2) {
        this.uomCodeZCoordinate2 = uomCodeZCoordinate2;
    }
    
    public Integer getMapID2() {
        return mapID2;
    }
    
    public void setMapID2(Integer mapID2) {
        this.mapID2 = mapID2;
    }
    
    public Integer getoALocatorID() {
        return oALocatorID;
    }
    
    public void setoALocatorID(Integer oALocatorID) {
        this.oALocatorID = oALocatorID;
    }
    
    public Integer getTextID() {
        return textID;
    }
    
    public void setTextID(Integer textID) {
        this.textID = textID;
    }
    
    public String getDepartment() {
        return department;
    }
    
    public void setDepartment(String department) {
        this.department = department;
    }
    
    public Integer getCalendarID() {
        return calendarID;
    }
    
    public void setCalendarID(Integer calendarID) {
        this.calendarID = calendarID;
    }
    
    public Integer getMobilityID() {
        return mobilityID;
    }
    
    public void setMobilityID(Integer mobilityID) {
        this.mobilityID = mobilityID;
    }
    
    public Integer getOwnershipID() {
        return ownershipID;
    }
    
    public void setOwnershipID(Integer ownershipID) {
        this.ownershipID = ownershipID;
    }
    
    public Integer getUnitID() {
        return unitID;
    }
    
    public void setUnitID(Integer unitID) {
        this.unitID = unitID;
    }
    
    public Integer getSpecificationID() {
        return specificationID;
    }
    
    public void setSpecificationID(Integer specificationID) {
        this.specificationID = specificationID;
    }
    
    public String getAisle() {
        return aisle;
    }
    
    public void setAisle(String aisle) {
        this.aisle = aisle;
    }
    
    public String getRow() {
        return row;
    }
    
    public void setRow(String row) {
        this.row = row;
    }
    
    public String getTier() {
        return tier;
    }
    
    public void setTier(String tier) {
        this.tier = tier;
    }
    
    public String getWorkCenter() {
        return workCenter;
    }
    
    public void setWorkCenter(String workCenter) {
        this.workCenter = workCenter;
    }
    
    public Integer getWarehouseLocationClassID() {
        return warehouseLocationClassID;
    }
    
    public void setWarehouseLocationClassID(Integer warehouseLocationClassID) {
        this.warehouseLocationClassID = warehouseLocationClassID;
    }
    
    public BigDecimal getCurrentWeightUtilization() {
        return currentWeightUtilization;
    }
    
    public void setCurrentWeightUtilization(BigDecimal currentWeightUtilization) {
        this.currentWeightUtilization = currentWeightUtilization;
    }
    
    public BigDecimal getCurrentSpaceUtilization() {
        return currentSpaceUtilization;
    }
    
    public void setCurrentSpaceUtilization(BigDecimal currentSpaceUtilization) {
        this.currentSpaceUtilization = currentSpaceUtilization;
    }
    
    public Integer getReferenceID() {
        return referenceID;
    }
    
    public void setReferenceID(Integer referenceID) {
        this.referenceID = referenceID;
    }
    
    public LocalDateTime getLastUpdateOn() {
        return lastUpdateOn;
    }
    
    public void setLastUpdateOn(LocalDateTime lastUpdateOn) {
        this.lastUpdateOn = lastUpdateOn;
    }
    
    public String getLastUpdatedBy() {
        return lastUpdatedBy;
    }
    
    public void setLastUpdatedBy(String lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }
    
    public LocalDateTime getCreatedOn() {
        return createdOn;
    }
    
    public void setCreatedOn(LocalDateTime createdOn) {
        this.createdOn = createdOn;
    }
    
    public String getCreatedBy() {
        return createdBy;
    }
    
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }
    
    public Boolean getActive() {
        return active;
    }
    
    public void setActive(Boolean active) {
        this.active = active;
    }
    
    public LocalDateTime getLastDeleteOn() {
        return lastDeleteOn;
    }
    
    public void setLastDeleteOn(LocalDateTime lastDeleteOn) {
        this.lastDeleteOn = lastDeleteOn;
    }
    
    public String getLastDeletedBy() {
        return lastDeletedBy;
    }
    
    public void setLastDeletedBy(String lastDeletedBy) {
        this.lastDeletedBy = lastDeletedBy;
    }
    
    public LocalDateTime getLastReactivateOn() {
        return lastReactivateOn;
    }
    
    public void setLastReactivateOn(LocalDateTime lastReactivateOn) {
        this.lastReactivateOn = lastReactivateOn;
    }
    
    public String getLastReactivatedBy() {
        return lastReactivatedBy;
    }
    
    public void setLastReactivatedBy(String lastReactivatedBy) {
        this.lastReactivatedBy = lastReactivatedBy;
    }
    
    public Integer getArchiveID() {
        return archiveID;
    }
    
    public void setArchiveID(Integer archiveID) {
        this.archiveID = archiveID;
    }
    
    public LocalDateTime getLastArchiveOn() {
        return lastArchiveOn;
    }
    
    public void setLastArchiveOn(LocalDateTime lastArchiveOn) {
        this.lastArchiveOn = lastArchiveOn;
    }
    
    public String getLastArchivedBy() {
        return lastArchivedBy;
    }
    
    public void setLastArchivedBy(String lastArchivedBy) {
        this.lastArchivedBy = lastArchivedBy;
    }
    
    public LocalDateTime getLastRestoreOn() {
        return lastRestoreOn;
    }
    
    public void setLastRestoreOn(LocalDateTime lastRestoreOn) {
        this.lastRestoreOn = lastRestoreOn;
    }
    
    public String getLastRestoredBy() {
        return lastRestoredBy;
    }
    
    public void setLastRestoredBy(String lastRestoredBy) {
        this.lastRestoredBy = lastRestoredBy;
    }
    
    public Integer getRowVersionStamp() {
        return rowVersionStamp;
    }
    
    public void setRowVersionStamp(Integer rowVersionStamp) {
        this.rowVersionStamp = rowVersionStamp;
    }
    
    public String getControlNo() {
        return controlNo;
    }
    
    public void setControlNo(String controlNo) {
        this.controlNo = controlNo;
    }
    
    public String getDsid() {
        return dsid;
    }
    
    public void setDsid(String dsid) {
        this.dsid = dsid;
    }
    
    public String getdSName() {
        return dSName;
    }
    
    public void setdSName(String dSName) {
        this.dSName = dSName;
    }
    
    @Override
    public String toString() {
        return "WarehouseLocation{" +
                "id=" + id +
                ", location='" + location + '\'' +
                ", facility='" + facility + '\'' +
                ", warehouse='" + warehouse + '\'' +
                ", warehouseLocationType=" + warehouseLocationType +
                ", zone='" + zone + '\'' +
                ", storageBin='" + storageBin + '\'' +
                ", walkPath=" + walkPath +
                ", allocationPath=" + allocationPath +
                ", fillPath=" + fillPath +
                ", xCoordinate1=" + xCoordinate1 +
                ", yCoordinate1=" + yCoordinate1 +
                ", zCoordinate1=" + zCoordinate1 +
                ", uomCodeXCoordinate1='" + uomCodeXCoordinate1 + '\'' +
                ", uomCodeYCoordinate1='" + uomCodeYCoordinate1 + '\'' +
                ", uomCodeZCoordinate1='" + uomCodeZCoordinate1 + '\'' +
                ", mapID1=" + mapID1 +
                ", xCoordinate2=" + xCoordinate2 +
                ", yCoordinate2=" + yCoordinate2 +
                ", zCoordinate2=" + zCoordinate2 +
                ", uomCodeXCoordinate2='" + uomCodeXCoordinate2 + '\'' +
                ", uomCodeYCoordinate2='" + uomCodeYCoordinate2 + '\'' +
                ", uomCodeZCoordinate2='" + uomCodeZCoordinate2 + '\'' +
                ", mapID2=" + mapID2 +
                ", oALocatorID=" + oALocatorID +
                ", textID=" + textID +
                ", department='" + department + '\'' +
                ", calendarID=" + calendarID +
                ", mobilityID=" + mobilityID +
                ", ownershipID=" + ownershipID +
                ", unitID=" + unitID +
                ", specificationID=" + specificationID +
                ", aisle='" + aisle + '\'' +
                ", row='" + row + '\'' +
                ", tier='" + tier + '\'' +
                ", workCenter='" + workCenter + '\'' +
                ", warehouseLocationClassID=" + warehouseLocationClassID +
                ", currentWeightUtilization=" + currentWeightUtilization +
                ", currentSpaceUtilization=" + currentSpaceUtilization +
                ", referenceID=" + referenceID +
                ", lastUpdateOn=" + lastUpdateOn +
                ", lastUpdatedBy='" + lastUpdatedBy + '\'' +
                ", createdOn=" + createdOn +
                ", createdBy='" + createdBy + '\'' +
                ", active=" + active +
                ",lastDeleteOn=" + lastDeleteOn +
                ", lastDeletedBy='" + lastDeletedBy + '\'' +
                ", lastReactivateOn=" + lastReactivateOn +
                ", lastReactivatedBy='" + lastReactivatedBy + '\'' +
                ", archiveID=" + archiveID +
                ", lastArchiveOn=" + lastArchiveOn +
                ", lastArchivedBy='" + lastArchivedBy + '\'' +
                ", lastRestoreOn=" + lastRestoreOn +
                ", lastRestoredBy='" + lastRestoredBy + '\'' +
                ", rowVersionStamp=" + rowVersionStamp +
                ", controlNo='" + controlNo + '\'' +
                ", dsid='" + dsid + '\'' +
                ", dSName='" + dSName + '\'' +
                '}';
        
    }
}
