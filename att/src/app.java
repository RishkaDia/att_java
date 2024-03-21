public class app {
    public static void main(String[] args) {
        PhoneBook phonebook = new PhoneBook();
        phonebook.put("Настя", "+996709");
        phonebook.put("Маша", "+996551");
        phonebook.put("Настя", "+996554");
        phonebook.put("Олег Иванович", "+996700");
        phonebook.put("Иван Олегович", "+996709");
        phonebook.put("Олег Иванович", "+996708");

        System.out.println(phonebook);
        System.out.println(phonebook.size());
        phonebook.delContact("Настя");
        System.out.println(phonebook);
        System.out.println(phonebook.size());
        phonebook.clear();
        System.out.println(phonebook);
        System.out.println(phonebook.size());
        System.out.println(phonebook.empty());
    }
}