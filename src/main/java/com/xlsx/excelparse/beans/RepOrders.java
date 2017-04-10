package com.xlsx.excelparse.beans;

import org.joda.time.DateTime;

/**
 * Created by Seth on 4/6/2017.
 */
public class RepOrders {

    private DateTime orderDate;
    private String region;
    private String representative;
    private String item;
    private Integer units;
    private Double unitCost;
    private Double total;

    public RepOrders() {
        super();
    }

    public RepOrders(DateTime orderDate, String region, String representative, String item, Integer units, Double unitCost, Double total) {
        this.orderDate = orderDate;
        this.region = region;
        this.representative = representative;
        this.item = item;
        this.units = units;
        this.unitCost = unitCost;
        this.total = total;
    }

    public DateTime getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(DateTime orderDate) {
        this.orderDate = orderDate;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getRepresentative() {
        return representative;
    }

    public void setRepresentative(String representative) {
        this.representative = representative;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public Integer getUnits() {
        return units;
    }

    public void setUnits(Integer units) {
        this.units = units;
    }

    public Double getUnitCost() {
        return unitCost;
    }

    public void setUnitCost(Double unitCost) {
        this.unitCost = unitCost;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "RepOrders{" +
                "orderDate=" + orderDate +
                ", region='" + region + '\'' +
                ", representative='" + representative + '\'' +
                ", item='" + item + '\'' +
                ", units=" + units +
                ", unitCost=" + unitCost +
                ", total=" + total +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RepOrders)) return false;

        RepOrders repOrders = (RepOrders) o;

        if (getOrderDate() != null ? !getOrderDate().equals(repOrders.getOrderDate()) : repOrders.getOrderDate() != null)
            return false;
        if (getRegion() != null ? !getRegion().equals(repOrders.getRegion()) : repOrders.getRegion() != null)
            return false;
        if (getRepresentative() != null ? !getRepresentative().equals(repOrders.getRepresentative()) : repOrders.getRepresentative() != null)
            return false;
        if (getItem() != null ? !getItem().equals(repOrders.getItem()) : repOrders.getItem() != null) return false;
        if (getUnits() != null ? !getUnits().equals(repOrders.getUnits()) : repOrders.getUnits() != null) return false;
        if (getUnitCost() != null ? !getUnitCost().equals(repOrders.getUnitCost()) : repOrders.getUnitCost() != null)
            return false;
        return getTotal() != null ? getTotal().equals(repOrders.getTotal()) : repOrders.getTotal() == null;
    }

    @Override
    public int hashCode() {
        int result = getOrderDate() != null ? getOrderDate().hashCode() : 0;
        result = 31 * result + (getRegion() != null ? getRegion().hashCode() : 0);
        result = 31 * result + (getRepresentative() != null ? getRepresentative().hashCode() : 0);
        result = 31 * result + (getItem() != null ? getItem().hashCode() : 0);
        result = 31 * result + (getUnits() != null ? getUnits().hashCode() : 0);
        result = 31 * result + (getUnitCost() != null ? getUnitCost().hashCode() : 0);
        result = 31 * result + (getTotal() != null ? getTotal().hashCode() : 0);
        return result;
    }
}
