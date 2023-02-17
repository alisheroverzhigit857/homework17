public class Main {
    public static void main(String[] args) {
        Java person1 = new Java("Malik",19,"M","turatbekov@gmail,com");
        Java person2 = new Java("Momun",17,"M","akkunov@gmail,com");
        Java person3 = new Java("Ruslan",20,"M","manasbekov@gmail,com");
        Java person4 = new Java("Baktiar",20,"M","baktiarov@gmail,com");
        Java person5 = new Java("Baeil",18,"M","nurdinov@gmail,com");
        Java person6 = new Java("Torogeldi",17,"M","niiazbekov@gmail,com");
        Java person7 = new Java("Davran",19,"M","joldoshbaev@gmail,com");

        Java [] java1 = {person1,person2,person3,person4,person5};
        Java [] java2 = {person6,person7};

        Android per = new Android("Aikezhan",39,"W","akmatova@gmail.com");
        Android per1 = new Android("Aizat",19,"W","taalaibekovna@gmail.com");
        Android per2 = new Android("Gulmira",30,"W","osmonova@gmail.com");
        Android per3 = new Android("Oksana",27,"W","saidilkanova@gmail.com");

        Android[] androids1 = {per,per1,per2};
        Android [] androids2 = {per3};

        Go gos = new Go("Manas",27,"M","abduganiev@gmail.com");
        Go gos1 = new Go("Snajar",20,"M","abdumomunov@gmail.com");
        Go gos2 = new Go("Mirbek",16,"M","nazhmidinov@gmail.com");

        Go [] go = {gos,gos1};
        Go [] go2 = {gos2};

        Company peaksoft = new Company("Bishkek","Esen Niiazov",java1,androids1,go);

        Company spaceX = new Company("USA","Ilon Mask",java2,androids2,go2);
        System.out.println(peaksoft);
        System.out.println("------------------------------------------");
        System.out.println(spaceX);
    }
}