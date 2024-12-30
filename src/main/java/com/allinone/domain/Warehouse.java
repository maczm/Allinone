package com.allinone.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Objects;

/**
 * <p>
 * 仓库实体
 * </p>
 *
 * @author wangzm
 * @since 2024-12-24
 */
@TableName("WAREHOUSE")
public class Warehouse implements Serializable {
    
    @Serial
    private static final long serialVersionUID = 1L;
    
    @TableField("Facility")
    private String facility;
    
    @TableId("Warehouse")
    private String warehouse;
    
    @TableField("WarehouseType")
    private Short warehouseType;
    
    @TableField("Building")
    private String building;
    
    @TableField("SAPWarehouse")
    private String sAPWarehouse;
    
    @TableField("TextID")
    private Integer textID;
    
    @TableField("LastLocationID")
    private Integer lastLocationID;
    
    @TableField("ProcessID")
    private Integer processID;
    
    @TableField("MobileFlag")
    private Boolean mobileFlag;
    
    @TableField("TransportationEquipmentFlag")
    private Boolean transportationEquipmentFlag;
    
    @TableField("PlanningUomCode")
    private String planningUomCode;
    
    @TableField("TrackingUomCode")
    private String trackingUomCode;
    
    @TableField("CostingUomCode")
    private String costingUomCode;
    
    @TableField("CostAccrualMethod")
    private String costAccrualMethod;
    
    @TableField("AllocationBasis")
    private String allocationBasis;
    
    @TableField("CumulativeAllocationUnits")
    private BigDecimal cumulativeAllocationUnits;
    
    @TableField("ReceivingLocationID")
    private Integer receivingLocationID;
    
    @TableField("WipLocationID")
    private Integer wipLocationID;
    
    @TableField("PutawayLocationID")
    private Integer putawayLocationID;
    
    @TableField("InventoryControllerID")
    private Integer inventoryControllerID;
    
    @TableField("Department")
    private String department;
    
    @TableField("CalendarID")
    private Integer calendarID;
    
    @TableField("MobilityID")
    private Integer mobilityID;
    
    @TableField("OwnershipID")
    private Integer ownershipID;
    
    @TableField("ProcurementID")
    private Integer procurementID;
    
    @TableField("CodeSystemType")
    private Short codeSystemType;
    
    @TableField("FormatType")
    private Short formatType;
    
    @TableField("DomainManagerID")
    private Integer domainManagerID;
    
    @TableField("ObjectClass")
    private String objectClass;
    
    @TableField("UnitID")
    private Integer unitID;
    
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
    
    @TableField("DSID")
    private String dsid;
    
    @TableField("DSName")
    private String dSName;
    
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
    
    public Short getWarehouseType() {
        return warehouseType;
    }
    
    public void setWarehouseType(Short warehouseType) {
        this.warehouseType = warehouseType;
    }
    
    public String getBuilding() {
        return building;
    }
    
    public void setBuilding(String building) {
        this.building = building;
    }
    
    public String getsAPWarehouse() {
        return sAPWarehouse;
    }
    
    public void setsAPWarehouse(String sAPWarehouse) {
        this.sAPWarehouse = sAPWarehouse;
    }
    
    public Integer getTextID() {
        return textID;
    }
    
    public void setTextID(Integer textID) {
        this.textID = textID;
    }
    
    public Integer getLastLocationID() {
        return lastLocationID;
    }
    
    public void setLastLocationID(Integer lastLocationID) {
        this.lastLocationID = lastLocationID;
    }
    
    public Integer getProcessID() {
        return processID;
    }
    
    public void setProcessID(Integer processID) {
        this.processID = processID;
    }
    
    public Boolean getMobileFlag() {
        return mobileFlag;
    }
    
    public void setMobileFlag(Boolean mobileFlag) {
        this.mobileFlag = mobileFlag;
    }
    
    public Boolean getTransportationEquipmentFlag() {
        return transportationEquipmentFlag;
    }
    
    public void setTransportationEquipmentFlag(Boolean transportationEquipmentFlag) {
        this.transportationEquipmentFlag = transportationEquipmentFlag;
    }
    
    public String getPlanningUomCode() {
        return planningUomCode;
    }
    
    public void setPlanningUomCode(String planningUomCode) {
        this.planningUomCode = planningUomCode;
    }
    
    public String getTrackingUomCode() {
        return trackingUomCode;
    }
    
    public void setTrackingUomCode(String trackingUomCode) {
        this.trackingUomCode = trackingUomCode;
    }
    
    public String getCostingUomCode() {
        return costingUomCode;
    }
    
    public void setCostingUomCode(String costingUomCode) {
        this.costingUomCode = costingUomCode;
    }
    
    public String getCostAccrualMethod() {
        return costAccrualMethod;
    }
    
    public void setCostAccrualMethod(String costAccrualMethod) {
        this.costAccrualMethod = costAccrualMethod;
    }
    
    public String getAllocationBasis() {
        return allocationBasis;
    }
    
    public void setAllocationBasis(String allocationBasis) {
        this.allocationBasis = allocationBasis;
    }
    
    public BigDecimal getCumulativeAllocationUnits() {
        return cumulativeAllocationUnits;
    }
    
    public void setCumulativeAllocationUnits(BigDecimal cumulativeAllocationUnits) {
        this.cumulativeAllocationUnits = cumulativeAllocationUnits;
    }
    
    public Integer getReceivingLocationID() {
        return receivingLocationID;
    }
    
    public void setReceivingLocationID(Integer receivingLocationID) {
        this.receivingLocationID = receivingLocationID;
    }
    
    public Integer getWipLocationID() {
        return wipLocationID;
    }
    
    public void setWipLocationID(Integer wipLocationID) {
        this.wipLocationID = wipLocationID;
    }
    
    public Integer getPutawayLocationID() {
        return putawayLocationID;
    }
    
    public void setPutawayLocationID(Integer putawayLocationID) {
        this.putawayLocationID = putawayLocationID;
    }
    
    public Integer getInventoryControllerID() {
        return inventoryControllerID;
    }
    
    public void setInventoryControllerID(Integer inventoryControllerID) {
        this.inventoryControllerID = inventoryControllerID;
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
    
    public Integer getProcurementID() {
        return procurementID;
    }
    
    public void setProcurementID(Integer procurementID) {
        this.procurementID = procurementID;
    }
    
    public Short getCodeSystemType() {
        return codeSystemType;
    }
    
    public void setCodeSystemType(Short codeSystemType) {
        this.codeSystemType = codeSystemType;
    }
    
    public Short getFormatType() {
        return formatType;
    }
    
    public void setFormatType(Short formatType) {
        this.formatType = formatType;
    }
    
    public Integer getDomainManagerID() {
        return domainManagerID;
    }
    
    public void setDomainManagerID(Integer domainManagerID) {
        this.domainManagerID = domainManagerID;
    }
    
    public String getObjectClass() {
        return objectClass;
    }
    
    public void setObjectClass(String objectClass) {
        this.objectClass = objectClass;
    }
    
    public Integer getUnitID() {
        return unitID;
    }
    
    public void setUnitID(Integer unitID) {
        this.unitID = unitID;
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
        return "Warehouse{" +
                "facility='" + facility + '\'' +
                ", warehouse='" + warehouse + '\'' +
                ", warehouseType=" + warehouseType +
                ", building='" + building + '\'' +
                ", sAPWarehouse='" + sAPWarehouse + '\'' +
                ", textID=" + textID +
                ", lastLocationID=" + lastLocationID +
                ", processID=" + processID +
                ", mobileFlag=" + mobileFlag +
                ", transportationEquipmentFlag=" + transportationEquipmentFlag +
                ", planningUomCode='" + planningUomCode + '\'' +
                ", trackingUomCode='" + trackingUomCode + '\'' +
                ", costingUomCode='" + costingUomCode + '\'' +
                ", costAccrualMethod='" + costAccrualMethod + '\'' +
                ", allocationBasis='" + allocationBasis + '\'' +
                ", cumulativeAllocationUnits=" + cumulativeAllocationUnits +
                ", receivingLocationID=" + receivingLocationID +
                ", wipLocationID=" + wipLocationID +
                ", putawayLocationID=" + putawayLocationID +
                ", inventoryControllerID=" + inventoryControllerID +
                ", department='" + department + '\'' +
                ", calendarID=" + calendarID +
                ", mobilityID=" + mobilityID +
                ", ownershipID=" + ownershipID +
                ", procurementID=" + procurementID +
                ", codeSystemType=" + codeSystemType +
                ", formatType=" + formatType +
                ", domainManagerID=" + domainManagerID +
                ", objectClass='" + objectClass + '\'' +
                ", unitID=" + unitID +
                ", referenceID=" + referenceID +
                ", lastUpdateOn=" + lastUpdateOn +
                ", lastUpdatedBy='" + lastUpdatedBy + '\'' +
                ", createdOn=" + createdOn +
                ", createdBy='" + createdBy + '\'' +
                ", active=" + active +
                ", lastDeleteOn=" + lastDeleteOn +
                ", lastDeletedBy='" + lastDeletedBy + '\'' +
                ", lastReactivateOn=" + lastReactivateOn +
                ", lastReactivatedBy='" + lastReactivatedBy + '\'' +
                ", archiveID=" + archiveID +
                ", lastArchiveOn=" + lastArchiveOn +
                ", lastArchivedBy='" + lastArchivedBy + '\'' +
                ", lastRestoreOn=" + lastRestoreOn +
                ", lastRestoredBy='" + lastRestoredBy + '\'' +
                ", rowVersionStamp=" + rowVersionStamp +
                ", dsid='" + dsid + '\'' +
                ", dSName='" + dSName + '\'' +
                '}';
    }
}
