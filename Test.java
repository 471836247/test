import java.math.BigDecimal;

/*
题目
1、有一家超市，出售苹果和草莓。其中苹果 8 元/斤，草莓 13 元/斤。
现在顾客 A 在超市购买了若干斤苹果和草莓，需要计算一共多少钱？
请编写函数，对于 A 购买的水果斤数 (水果斤数为大于等于 0 的整数)，计算并返回所购买商品的总价。

2、超市增加了一种水果芒果，其定价为 20 元/斤。
现在顾客 B 在超市购买了若干斤苹果、 草莓和芒果，需计算一共需要多少钱？
请编写函数，对于 B 购买的水果斤数 (水果斤数为大于等于 0 的整数)，计算并返回所购买商品的总价。

3、超市做促销活动，草莓限时打 8 折。
现在顾客 C 在超市购买了若干斤苹果、 草莓和芒果，需计算一共需要多少钱？
请编写函数，对于 C 购买的水果斤数 (水果斤数为大于等于 0 的整数)，计算并返回所购买商品的总价。

4、促销活动效果明显，超市继续加大促销力度，购物满 100 减 10 块。
现在顾客 D 在超市购买了若干斤苹果、 草莓和芒果，需计算一共需要多少钱？
请编写函数，对于 D 购买的水果斤数 (水果斤数为大于等于 0 的整数)，计算并返回所购买商品的总价。

要求
使用 Java 程序编写，IDE 不限，
请使用面向对象的思路进行程序编写。
需在程序中，验证函数计算结果的正确性。

提示
顾客购买的水果斤数，可自行确定。无论数值为多少，均需验证程序计算结果的正确性。
可以编写多个函数分别实现，也可以只编写一个函数实现，方式不限。
面试时，请准备电脑及 IDE 环境进行现场演示。
若能将代码提交到 github、gitee、gitlab 等代码托管仓库，提供代码仓库地址更佳。

 */
public class Test {

    public static  final double  APPLE_PRICE = 8;
    public static  final double  STRAW_PRICE = 13;
    public static  final double  MANGO_PRICE = 20;
    public static  final double STRAW_DISCOUNT = 0.8;
    public static  final double HUNDRED_DISCOUNT = 10;
    public static void main(String[] args) {
        double appleWeight = 2;
        double strawberryWeight = 3;
        double mangoWeight = 3;
        double appleMoney =  totalMoneyBuyApple(appleWeight);
        double strawMoney =  totalMoneyBuyStraw(strawberryWeight);
        //第一题
        System.out.println(appleMoney+strawMoney);
        double mangoMoney =  totalMoneyBuyMango(mangoWeight);
        //第二题
        System.out.println(appleMoney+strawMoney+mangoMoney);
        strawMoney =  totalMoneyBuyStrawDis(strawMoney);
        //第三题
        System.out.println(appleMoney+strawMoney+mangoMoney);
        double totalMoney =totalMoney(appleMoney+strawMoney+mangoMoney);
        //第四题
        System.out.println(totalMoney);
    }

    private static double totalMoney(double total) {
        int dis = (int) (total/100);
        return total-dis*HUNDRED_DISCOUNT;
    }

    private static double totalMoneyBuyStrawDis(double strawMoney) {
        return strawMoney*STRAW_DISCOUNT;
    }

    private static double totalMoneyBuyMango(double mangoWeight) {
        return mangoWeight*MANGO_PRICE;
    }

    private static double totalMoneyBuyStraw(double strawberryWeight) {
        return strawberryWeight*STRAW_PRICE;
    }

    private static double totalMoneyBuyApple(double appleWeight) {
        return appleWeight*APPLE_PRICE;
    }

}
