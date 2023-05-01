import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your game name");
        String username = scanner.nextLine();
        System.out.println("Wellcome, " + username + "!");

        //提取随机家族
        Hat hat = new Hat();
        String assignedFamily = hat.assignFamily();
        System.out.println("You are born in " + assignedFamily+"!");
        hat.summonLegendarySword();


        // 创建巫师并装备魔杖和分拣帽
        Wizard harry = new Wizard(username,100);
        harry.setWand(new Wand("Holly", "Phoenix Feather"));



        // 生成第一关卡和敌人
        Level level1 = new Level1();
        level1.generateEnemies();
        System.out.println("Starting Level 1...");
        level1.startLevel(harry);
        System.out.println("Completed Level 1.");

        Level level2 = new Level("Level 2", "You are now in your second year at Hogwarts.");
        Level level3 = new Level("Level 3", "You are now in your third year at Hogwarts.");
        Level level4 = new Level("Level 4", "You are now in your fourth year at Hogwarts.");
        Level level5 = new Level("Level 5", "You are now in your fifth year at Hogwarts.");
        Level level6 = new Level("Level 6", "You are now in your sixth year at Hogwarts.");
        Level level7 = new Level("Level 7", "This is your final year at Hogwarts!");

        // 为每个关卡生成敌人
        level1.generateEnemies();
        level2.generateEnemies();
        level3.generateEnemies();
        level4.generateEnemies();
        level5.generateEnemies();
        level6.generateEnemies();
        level7.generateEnemies();

        // 让巫师开始每个关卡的战斗
        level1.startLevel(harry);
        level2.startLevel(harry);
        level3.startLevel(harry);
        level4.startLevel(harry);
        level5.startLevel(harry);
        level6.startLevel(harry);
        level7.startLevel(harry);
    }

}