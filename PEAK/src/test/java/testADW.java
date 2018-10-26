import it.uniroma1.lcl.adw.ADW;
import it.uniroma1.lcl.adw.DisambiguationMethod;
import it.uniroma1.lcl.adw.LexicalItemType;
import it.uniroma1.lcl.adw.comparison.SignatureComparison;
import it.uniroma1.lcl.adw.comparison.WeightedOverlap;
import it.uniroma1.lcl.jlt.Configuration;
import sun.plugin2.liveconnect.JSExceptions;

public class testADW {

    public static void main(String args[]) throws Exception {
        //the two lexical items to be compared
        String text1 = "a mill that is powered by the wind";
        String text2 = "windmill.n.1";

        //types of the two lexical items
        LexicalItemType srcTextType = LexicalItemType.SURFACE;
        LexicalItemType trgTextType = LexicalItemType.WORD_SENSE;

        //if lexical items has to be disambiguated
        DisambiguationMethod disMethod = DisambiguationMethod.ALIGNMENT_BASED;

        //measure for comparing semantic signatures
        SignatureComparison measure = new WeightedOverlap();

        ADW pipeLine = new ADW();
//
//        String s = Configuration.getInstance().getStanfordPOSModel();
//        System.out.println(s);
//
//        String s2 = Configuration.getInstance().getAolQueryDirectory();
//        System.out.println(s2);
        double similarity = pipeLine.getPairSimilarity(text1, text2,
        disMethod, measure,
        srcTextType, trgTextType);
        System.out.println(similarity);

    }

}
