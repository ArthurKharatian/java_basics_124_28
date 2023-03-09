package itmo.java.basics.lesson5;

public class StringExample {

    public static void main(String[] args) {

        String java = "Java";


//        String java2 = new String("Java");

//        System.out.println(java == java2);
//        System.out.println(java.equals(java2));
//        System.out.println(java.equalsIgnoreCase(java2));

        java = java.concat(" Developer");

//        System.out.println(java);

//        java = java + 123;

//        System.out.println(java);

//        java = 80 + 120 + java + (140 + 160);

//        System.out.println(java);


        int length = java.length();

        char[] chars = java.toCharArray();
//        for (char aChar : chars) {
//            if (Character.isDigit(aChar)) {
//                System.out.println(aChar);
//            }
//        }

//        String str = null;
//        str = "";
//        str = " ";
//
//        if (str != null && !java.isEmpty()) {
//
//        }
//
//
//
//        boolean empty = java.isEmpty();


//        String substring = java.substring(3);
//        System.out.println(substring);


//        String substring = java.substring(3, 7);
//        System.out.println(substring);

        String str = " 1111Hello world12345!    ";

//        System.out.println(str);
//        System.out.println(str.trim());

//        String replaceAll = str.replaceAll("1", "?");
//        String s = str.replaceAll("[^0-9]", "");
//        System.out.println(s);

        String text = "Lorem Ipsum - это текст-\"рыба\", часто используемый в печати и вэб-дизайне. Lorem Ipsum является стандартной \"рыбой\" для текстов на латинице с начала XVI века. В то время некий безымянный печатник создал большую коллекцию размеров и форм шрифтов, используя Lorem Ipsum для распечатки образцов. Lorem Ipsum не только успешно пережил без заметных изменений пять веков, но и перешагнул в электронный дизайн. Его популяризации в новое время послужили публикация листов Letraset с образцами Lorem Ipsum в 60-х годах и, в более недавнее время, программы электронной вёрстки типа Aldus PageMaker, в шаблонах которых используется Lorem Ipsum.";

//        String[] split = text.split(" ");
//        for (String s : split) {
//            System.out.println(s);
//        }

//        int counter = 0;
//        char[] textChars = text.toCharArray();
//        for (char aChar : textChars) {
//            if (Character.isDigit(aChar)) {
//                counter++;
//            }
//        }

//        System.out.println(counter);

//        Integer number = 34234324;

//        String s = number.toString();
//        String s = String.valueOf(number);
//        System.out.println(s);

        StringBuilder builder = new StringBuilder();
//        StringBuilder builder2 = new StringBuilder(java);

//        System.out.println(java == builder.toString());       //   ?    false  true   false
//        System.out.println(builder == builder2);              //   ?    false  true   false
//        System.out.println(builder.equals(builder2));         // true          true   true
//        System.out.println(java.equals(builder));             // true          true   false/exception
//        System.out.println(java.equals(builder.toString()));   // true          true   true
//        System.out.println(builder2.toString().equals(builder.toString()));   // true          true   true

//
//        System.out.println(builder);
//        System.out.println(builder2);

//
//        Car car = new Car("Lada", "Vesta", Color.WHITE, true);
//        Car car2 = new Car("Lada", "Vesta", Color.WHITE, true);

//        System.out.println(car.equals(car2));


        for(String word : text.split(" ")) {
            builder.append(word)
                    .append(", ");
        }

//        System.out.println(builder);


//        System.out.println(builder.reverse());


        builder.insert(3, "St.-Petersburg");
        System.out.println(builder);

        StringBuffer buffer = new StringBuffer();



    }
}
