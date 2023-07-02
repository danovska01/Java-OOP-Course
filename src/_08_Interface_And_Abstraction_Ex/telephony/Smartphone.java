package _08_Interface_And_Abstraction_Ex.telephony;
import java.util.List;

public class Smartphone implements Callable, Browsable {
    private List<String> numbers;
    private List<String> urls;

    public Smartphone(List<String> numbers, List<String> urls) {
        this.numbers = numbers;
        this.urls = urls;
    }


    @Override
    public String browse() {
        StringBuilder sbUrls = new StringBuilder();
        for (int i = 0; i < urls.size(); i++) {
            String url = urls.get(i);
            if (containsNumber(url)) {
                sbUrls.append("Invalid URL!").append(System.lineSeparator());
            } else {
                sbUrls.append("Browsing: ").append(url).append("!").append(System.lineSeparator());
            }
        }

        return sbUrls.toString();

//        return urls.stream()
//                .map(url -> containsNumber(url) ? "Invalid URL!" : "Browsing: " + url)
//                .collect(Collectors.joining(System.lineSeparator()));
    }
    @Override
    public String call() {
        StringBuilder sbNumbers = new StringBuilder();
        for (int i = 0; i < numbers.size(); i++) {
            String number = numbers.get(i);
            if (containsNonDigit(number)) {
                sbNumbers.append("Invalid number!").append(System.lineSeparator());
            } else {
                sbNumbers.append("Calling... ").append(number).append(System.lineSeparator());
            }
        }

        return sbNumbers.toString();

//        return numbers.stream()
//                .map(number -> containsNonDigit(number) ? "Invalid number!" : "Calling... " + number)
//                .collect(Collectors.joining(System.lineSeparator()));
    }

    private boolean containsNumber(String str) {
        return str.matches(".*\\d.*");

    }
    private boolean containsNonDigit(String str) {
        return !str.matches("\\d+");
    }
}