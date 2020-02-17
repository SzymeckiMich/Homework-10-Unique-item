import java.util.Scanner;

public class SwordCreator {
    private Sword[] swordsArrayy = new Sword[3];
    private int index = 0;

    public void createSword() {
        if (index == swordsArrayy.length) {
            System.out.println("Your inventory is full. Your swords: ");
            for (int i = 0; i < swordsArrayy.length; i++) {
                System.out.println(swordsArrayy[i].toString());
            }
            System.exit(0);
        } else {
            swordsArrayy[index] = uniqueCreator();
            index++;
        }
    }


    private Sword uniqueCreator() {
        boolean flag = true;
        Sword newSword = null;
        while (flag) {
            newSword = swordCreator();
            if (isSwordUnique(newSword)) {
                flag = false;
            } else {
                System.out.println("This sword isn't unique. Try again.");
            }
        }
        return newSword;
    }


    private Sword swordCreator() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name of " + (index + 1) + " sword: ");
        String name = scanner.nextLine();
        System.out.println("Enter damage of " + (index + 1) + " sword: ");
        double damage = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Is the " + (index + 1) + " sword two-handed: ");
        boolean twoHanded = scanner.nextBoolean();

        return new Sword(name, damage, twoHanded);
    }

    private boolean isSwordUnique(Sword sword) {
        boolean unique = true;
        for (int i = 0; i < swordsArrayy.length; i++) {
            if (sword.equals(swordsArrayy[i])) {
                unique = false;
                break;
            }
        }
        return unique;
    }


}

