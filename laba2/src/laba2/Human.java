package laba2;

public class Human
{
    private int height;
    private String name = "неизвестно";
    private String surname = "неизвестно";

    public Human()
    {
        name="неизвестно";
        surname="неизвестно";
    }
    public void setName (String name)
    {
        this.name = name;
    }

    public void setHeight (int height)
    {
        this.height = height;
    }

    public void setSurname (String surname)
    {
        this.surname = surname;
    }

    public void information ()
    {
        System.out.println("Имя " + name + "\nФамилия " + surname);
    }



    class Hand {
        private String processHand = "опущена";
        public void processHand()
        {
            System.out.println("рука " + processHand);
        }

        public void setHand(String p)
        {
            this.processHand=p;
        }
    }

    static class Head
    {
        private String processHead = "тупит";
        public void processHead1()
        {
            System.out.println("голова " + processHead);
        }

        public void setHead(String p)
        {
            this.processHead=p;
        }
    }

    class Leg
    {
        private String processLeg = "стоят";
        public void setLeg(String processLeg)
        {
            this.processLeg = processLeg;
        }
        public void processLeg1()
        {
            System.out.println( "ноги " + processLeg);
        }
    }
}
