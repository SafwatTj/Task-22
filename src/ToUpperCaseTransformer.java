public class ToUpperCaseTransformer implements  StringTransformer {

    @Override
    public String apply(String str) {
        return str.toUpperCase();
    }
}
