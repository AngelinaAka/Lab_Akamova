/*public class Phone {
    String number;
    String model;
    double weight;

    public Phone(String number, String model, double weight)
    {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(String number, String model)
    {
        this.number = number;
        this.model = model;
    }

    public Phone() {
    }

    public void receiveCall(String name)
    {
        System.out.println("Звонит " + name);
    }

    public void receiveCall(String name, String callerNumber)
    {
        System.out.println("Звонит " + name + ". Номер телефона: " + callerNumber);
    }

    public String getNumber()
    {
        return number;
    }

    public void sendMessage(String... numbers)
    {
        System.out.println("Отправить сообщение на номера:");
        for (String number : numbers) {
            System.out.println(number);
        }
    }
}*/
// Класс Phone в соответствии с концепцией JavaBean
    public class Phone {
    String number;
    String model;
    double weight;
    public Phone() {
    }
    public void receiveCall(String name)
    {
        System.out.println("Звонит " + name);
    }
    public void receiveCall(String name, String callerNumber)
    {
        System.out.println("Звонит " + name + ". Номер телефона: " + callerNumber);
    }
    public void sendMessage(String... numbers)
    {
        System.out.println("Отправить сообщение на номера:");
        for (String number : numbers) {
            System.out.println(number);
        }
    }
    public String getNumber()
    {
        return number;
    }
    public void setNumber(String number)
    {
        this.number = number;
    }
    public String getModel()
    {
        return model;
    }
    public void setModel(String model)
    {
        this.model = model;
    }
    public double getWeight()
    {
        return weight;
    }
    public void setWeight(double weight)
    {
        this.weight = weight;
    }
}