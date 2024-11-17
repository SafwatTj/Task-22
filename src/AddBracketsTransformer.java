public class AddBracketsTransformer implements StringTransformer{
    @Override
    public String apply(String str) {
        return "("+str+")";
    }
}
