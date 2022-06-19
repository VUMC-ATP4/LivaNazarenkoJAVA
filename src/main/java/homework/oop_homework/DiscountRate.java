package homework.oop_homework;

public class DiscountRate {

    private static double PremiumService = 0.20;
    private static double goldService = 0.15;
    private static double silverService = 0.10;
    private static double noneService = 0.00;

    private static double premiumProduct = 0.10;
    private static double goldProduct = 0.10;
    private static double silverProduct = 0.10;
    private static double noneProduct = 0.10;

    public static double getPremiumService() {
        return PremiumService;
    }

    public static void setPremiumService(double premiumService) {
        PremiumService = premiumService;
    }

    public static double getGoldService() {
        return goldService;
    }

    public static void setGoldService(double goldService) {
        DiscountRate.goldService = goldService;
    }

    public static double getSilverService() {
        return silverService;
    }

    public static void setSilverService(double silverService) {
        DiscountRate.silverService = silverService;
    }

    public static double getNoneService() {
        return noneService;
    }

    public static void setNoneService(double noneService) {
        DiscountRate.noneService = noneService;
    }

    public static double getPremiumProduct() {
        return premiumProduct;
    }

    public static void setPremiumProduct(double premiumProduct) {
        DiscountRate.premiumProduct = premiumProduct;
    }

    public static double getGoldProduct() {
        return goldProduct;
    }

    public static void setGoldProduct(double goldProduct) {
        DiscountRate.goldProduct = goldProduct;
    }

    public static double getSilverProduct() {
        return silverProduct;
    }

    public static void setSilverProduct(double silverProduct) {
        DiscountRate.silverProduct = silverProduct;
    }

    public static double getNoneProduct() {
        return noneProduct;
    }

    public static void setNoneProduct(double noneProduct) {
        DiscountRate.noneProduct = noneProduct;
    }
}
