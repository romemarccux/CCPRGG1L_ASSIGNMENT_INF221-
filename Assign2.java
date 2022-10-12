public class Assign2 {
    public static void main(String[] args) throws Exception {

        // for Loop
        for (int firstnameCount = 6; firstnameCount != 0; firstnameCount--) {

            // break 
            if (firstnameCount == 3){
                System.out.println("Break timeout!");
                break;
            }
            System.out.println("Jerome");
        }
        // While Loop
        int nicknameCount = 6;
         while (nicknameCount != 0) {
            System.out.println("rome");
            nicknameCount--;
            //continue 
            if (nicknameCount == 3){
                System.out.println("Go ahead i will skip this third loop. i will ride on the next loop");
                continue;
            }
            System.out.println("Rome");
        }
         //Do-while Loop
        int surnameCount = 6;
          do {
            System.out.println("Unidad");
            surnameCount--;
        } while (surnameCount != 0);
    }
}