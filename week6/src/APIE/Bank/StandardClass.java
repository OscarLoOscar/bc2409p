package APIE.Bank;

public class StandardClass extends Account {

  private Long couponNumber;

  public StandardClass(String firstName, String lastName, double balance,
      Long couponNumber) {
    super(firstName, lastName, balance);
    this.couponNumber = 0l;
  }

  public Long getCouponNumber() {
    return this.couponNumber;
  }

  public void setCoupon(Long couponNumber) {
    this.couponNumber = couponNumber;
  }

  @Override
  public String toString() {
    return super.toString() + " , Coupon Number : " + this.getCouponNumber();
  }

  @Override
  public String accountType() {
    return "StandardClass";
  }

}
