public class Main {
    public static void main(String[] args) {
        boolean result = TenMinWalk.isValid( new char [] {'n','s','s','s','s','s','n','n','n','n'});
        System.out.println(result);
    }
    public static class TenMinWalk {
        public static boolean isValid(char[] walk) {
            if(walk.length != 10) {
                return false;
            }
            boolean walkIsValid = false;
           int x = 0;
           int y = 0;
            for(char direction : walk){
                if(direction == 'n'){
                    y++;
                }
                if(direction == 's'){
                    y--;
                }
                if(direction == 'e'){
                    x++;
                }
                if(direction == 'w'){
                    x--;
                }
            }
            if (x == 0 && y ==0) {
                walkIsValid = true;
            }
            return walkIsValid;
        }
    }
}