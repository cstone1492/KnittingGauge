package one.philosopherstone.knittingconversions.models;

import javax.persistence.Entity;

@Entity
public class Gauge extends AbstractEntity{

    private Integer rpi;

    private Integer spi;

    private Integer needleSize;

    public Gauge() {
    }

    public Gauge(Integer rpi, Integer spi, Integer needleSize) {
        this.rpi = rpi;
        this.spi = spi;
        this.needleSize = needleSize;
    }

    public Integer getRpi() {
        return rpi;
    }

    public void setRpi(Integer rpi) {
        this.rpi = rpi;
    }

    public Integer getSpi() {
        return spi;
    }

    public void setSpi(Integer spi) {
        this.spi = spi;
    }

    public Integer getNeedleSize() {
        return needleSize;
    }

    public void setNeedleSize(Integer needleSize) {
        this.needleSize = needleSize;
    }
}
