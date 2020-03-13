public class wee{

    public static void main(String[]args){
        Hero hero1 = new Hero();
        
        hero1.setName("hero1");
        System.out.println("Name\t:"+hero1.getName());

        hero1.setHeight("150");
        System.out.println("Author\t:"+hero1.getHeight());
        
        hero1.setWeight("80");
        System.out.println("Page\t:"+hero1.getWeight());

        hero1.setGender("male");
        System.out.println("Price\t:"+hero1.getGender());

        hero1.setAge("80");
        System.out.println("Collect\t:"+hero1.getAge());


        Hero hero2 = new Hero();
        
        hero2.setName("hero2");
        System.out.println("Name\t:"+hero2.getName());


        hero2.setHeight("154");
        System.out.println("Author\t:"+hero2.getHeight());
        
        hero2.setWeight("58");
        System.out.println("Page\t:"+hero2.getWeight());

        hero2.setGender("male");
        System.out.println("Price\t:"+hero2.getGender());

        hero2.setAge("25");
        System.out.println("Collect\t:"+hero2.getAge());



        Hero hero3 = new Hero();
        
        hero3.setName("hero3");
        System.out.println("Name\t:"+hero3.getName());


        hero3.setHeight("178");
        System.out.println("Author\t:"+hero3.getHeight());
        
        hero3.setWeight("78");
        System.out.println("Page\t:"+hero3.getWeight());

        hero3.setGender("female");
        System.out.println("Price\t:"+hero3.getGender());

        hero3.setAge("30");
        System.out.println("Collect\t:"+hero3.getAge());

    }
}