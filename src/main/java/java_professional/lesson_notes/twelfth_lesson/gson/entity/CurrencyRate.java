package java_professional.lesson_notes.twelfth_lesson.gson.entity;

import com.google.gson.annotations.SerializedName;

import java.math.BigDecimal;

public class CurrencyRate {
    //base_ccy
    @SerializedName("ccy") //не знаходить
    private String from;
    @SerializedName("base_ccy")
    private String to;
    private BigDecimal buy;
    private BigDecimal sale;

    public CurrencyRate() {
    }

    public CurrencyRate(String base_ccy, String ccy, BigDecimal buy, BigDecimal sale) {
        this.from = base_ccy;
        this.to = ccy;
        this.buy = buy;
        this.sale = sale;
    }

    @Override
    public String toString() {
        return "CurrencyRate{" +
                "from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", buy=" + buy +
                ", sale=" + sale +
                '}';
    }

    public String getBase_ccy() {
        return from;
    }

    public void setBase_ccy(String base_ccy) {
        this.from = base_ccy;
    }

    public String getCcy() {
        return to;
    }

    public void setCcy(String ccy) {
        this.to = ccy;
    }

    public BigDecimal getBuy() {
        return buy;
    }

    public void setBuy(BigDecimal buy) {
        this.buy = buy;
    }

    public BigDecimal getSale() {
        return sale;
    }

    public void setSale(BigDecimal sale) {
        this.sale = sale;
    }
}
