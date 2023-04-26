package example.project.GodClassExample;

public class PaySchedule {

    // public String payDay;  // TODO: make this variable private and be accessed through getter/setter
    private String payDay;

    public PaySchedule(String payDay) {
        this.payDay = payDay;
    }

    public String getPayDay() {
        return payDay;
    }

    public void setPayDay(String payDay) { this.payDay = payDay; }
}
