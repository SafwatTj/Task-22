public class AddUSDCharTransformer implements StringTransformer{
    @Override
    public String apply(String str) {
        return "$"+str;
    }
}
