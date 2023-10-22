public class main {
        public static void main(String[] args) {
                PasswordGen pgen = new PasswordGen();
                pgen.init();
                System.out.println(pgen.generate());
        }
}