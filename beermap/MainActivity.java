package amilosevic.ferit.beermap;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements NameClickListener{

    List<String> titles = new ArrayList<>();
    List<String> history = new ArrayList<>();
    List<String> description = new ArrayList<>();

    private RecyclerView recycler;
    private RecyclerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupRecycler();
        setupRecyclerData();
    }

    private void setupRecycler(){
        recycler = findViewById(R.id.recyclerView);
        recycler.setLayoutManager(new LinearLayoutManager(this));

        adapter = new RecyclerAdapter(this);
        recycler.setAdapter(adapter);
    }

    private void setupRecyclerData(){
        titles.add("India Pale Ale");
        titles.add("Wheat Beer");
        titles.add("Lager");
        titles.add("Pale Ale");
        titles.add("Stout");
        titles.add("Porter");

        history.add("The IPA was invented in Britain. Here’s the abridged version: British sailors, while sailing to India, loaded up barrels of beer with hops, because hops were a preservative. " +
                "The hops hung around in the beer for so long that they lost their fruity flavor and left a bitter tasting beer.The pale ales of the " +
                "early eighteenth century were lightly hopped and quite different from today's pale ales. " +
                "By the mid-eighteenth century, pale ale was mostly brewed with coke-fired malt, which produced less smoking and roasting of barley in the malting process, and hence produced a paler beer.\n" +
                "One such variety of beer was October beer, a pale well-hopped brew popular among the landed gentry, who brewed it domestically; once brewed it was intended to cellar two years." +
                "Among the first brewers known to export beer to India was George Hodgson's Bow Brewery, on the Middlesex-Essex border.\n" +
                "Bow Brewery beers became popular among East India Company traders in the late eighteenth century because of the brewery's location near the East India Docks and Hodgson's liberal credit line of 18 months.\n" +
                "Ships transported Hodgson's beers to India, among them his October beer, which benefited exceptionally from conditions of the voyage and was apparently highly regarded among its consumers in India. " +
                "Bow Brewery came into the control of Hodgson's son in the early nineteenth century, but his business practices alienated their customers.\n" +
                "During the same period, several Burton breweries lost their European export market in Russia when the Tsar banned the trade, and were seeking a new export market for their beer");

        history.add("Wheat beer is a beer, usually top-fermented, which is brewed with a large proportion of wheat relative to the amount of malted barley. " +
                "The two main varieties are Weißbier, based on the German tradition, and Witbier, based on the Belgian tradition; " +
                "other types include Lambic (made with wild yeasts and bacteria), Berliner Weisse (a cloudy, sour beer), and Gose (a German-type sour, salty, herbal beer).\n" +
                "Two common varieties of wheat beer are Weißbier (German – \"white beer\") based on the German tradition of mixing at least 50% wheat to barley malt to make a light " +
                "coloured top-fermenting beer, and witbier (Dutch – \"white beer\") based on the Belgian tradition of using flavorings such as coriander and orange peel.\n" +
                "Belgian white beers are often made with raw unmalted wheat, as opposed to the malted wheat used in other varieties. ");

        history.add("While cold storage of beer, \"lagering\", in caves for example, was a common practice throughout the medieval period, bottom-fermenting yeast seems to have emerged as a hybridization in the early " +
                "fifteenth century. In 2011, a team of researchers claimed to have discovered that Saccharomyces eubayanus is responsible for creating the hybrid yeast used to make lager.\n" +
                "Based on the numbers of breweries, lager brewing became the main form of brewing in the Kingdom of Bohemia between 1860 and 1870. " +
                "In the 19th century, prior to the advent of refrigeration, German brewers would dig cellars for lagering and fill them with ice from nearby lakes and rivers, which would cool the beer during the summer months.\n" +
                "To further protect the cellars from the summer heat, they would plant chestnut trees, which have spreading, dense canopies but shallow roots which would not intrude on the caverns. " +
                "The practice of serving beer at these sites evolved into the modern beer garden.");

        history.add("Coke had been first used for dry roasting malt in 1642, but it wasn't until around 1703 that the term \"pale ale\" was first applied to beers made from such malt. " +
                "By 1784, advertisements appeared in the Calcutta Gazette for \"light and excellent\" pale ale.\n" +
                "By 1830, the expressions bitter and pale ale were synonymous. Breweries tended to designate beers as \"pale ales\", though customers would commonly refer to the same beers as \"bitters.\" " +
                "It is thought that customers used the term bitter to differentiate these pale ales from other less noticeably hopped beers such as porters and milds.\n" +
                "By the mid to late 20th century, while brewers were still labeling bottled beers as pale ales, they had begun identifying cask beers as bitters, except those from Burton on Trent, which tend to be referred to as pale ales.");

        history.add("Originally, the adjective stout meant \"proud\" or \"brave\", but later, after the 14th century, it took on the connotation of \"strong\". " +
                "The first known use of the word stout for beer was in a document dated 1677 found in the Egerton Manuscript, the sense being that a stout beer was a strong beer.\n" +
                "The expression stout porter was applied during the 18th century to strong versions of porter. Stout still meant only \"strong\" and it could be related to any kind of beer, as long as it was strong: " +
                "in the UK it was possible to find \"stout pale ale\", for example. Later, stout was eventually to be associated only with porter, becoming a synonym of dark beer.\n" +
                "Originated in London, England in the early 1720s. The style quickly became popular in the City especially with porters (hence its name): it had a strong flavour, took longer " +
                "to spoil than other beers, was significantly cheaper than other beers, and was not easily affected by heat.\n" +
                "Within a few decades, porter breweries in London had grown \"beyond any previously known scale\". Large volumes were exported to Ireland and by 1776 it was being brewed by Arthur Guinness at his St. " +
                "James's Gate Brewery. In the 19th century, the beer gained its customary black colour through the use of black patent malt, and became stronger in flavour.");

        history.add("In 1802, John Feltham wrote a version of the history of porter that has been used as the basis for most writings on the topic. " +
                "Very little of Feltham's story is backed up by contemporary evidence; his account is based on a letter written by Obadiah Poundage (who had worked for decades in the London brewing trade) in the 1760s.\n" +
                "Feltham badly misinterpreted parts of the text, mainly due to his unfamiliarity with 18th-century brewing terminology. " +
                "Feltham claimed that in 18th-century London a popular beverage called three threads was made consisting of a third of a pint each of ale, beer and twopenny (the strongest beer, costing two pence a quart).\n" +
                "About 1730, Feltham said, a brewer called Harwood made a single beer called Entire or Entire butt, which recreated the flavour of \"three threads\" and became known as \"porter\"." +
                "During the First World War in Britain, shortages of grain led to restrictions on the strength of beer. " +
                "Less strict rules were applied in Ireland, allowing Irish brewers such as Guinness to continue to brew beers closer to pre-war strengths.\n" +
                "English breweries continued to brew a range of bottled, and sometimes draught, stouts until the Second World War and beyond. " +
                "During the Second World War, because of the Irish Free State's official policy of neutrality, this period was not technically considered wartime, however the country suffered similar resource " +
                "scarcities and consequent rationing to the United Kingdom, thus this period was officially named The Emergency there.\n" +
                "They were considerably weaker than the pre-war versions (down from 1.055–1.060 to 1.040–1.042) and around the strength that porter had been in 1914. " +
                "The drinking of porter, with its strength slot now occupied by single stout, steadily declined, and the last porter was produced in 1941");

        description.add("If you like bitter, floral, earthy, citrusy, piney, fruity, and, yes once more, bitter flavor notes, you'll like an IPA.");

        description.add("Two common varieties of wheat beer are Weißbier (German – \"white beer\") based on the German tradition of mixing at least 50% wheat to barley malt to make a light coloured top-fermenting beer, " +
                "and witbier (Dutch – \"white beer\") based on the Belgian tradition of using flavorings such as coriander and orange peel.");

        description.add("Lager beer uses a process of cool fermentation, followed by maturation in cold storage. The German word \"Lager\" means storeroom or warehouse. " +
                "The yeast generally used with lager brewing is Saccharomyces pastorianus. It is a close relative of the Saccharomyces cerevisiae yeast used for warm fermented ales. " +
                "While prohibited by the German Reinheitsgebot tradition, lagers in some countries often feature large proportions of adjuncts, usually rice or maize. " +
                "Adjuncts entered United States brewing as a means of thinning out the body of beers, balancing the large quantities of protein introduced by six-row barley. " +
                "Adjuncts are often used now in beermaking to introduce a large quantity of sugar, and thereby increase ABV, at a lower price than a formulation using an all-malt grain bill. " +
                "There are however cases in which adjunct usage actually increases the cost of manufacture");

        description.add("Different brewing practices and hop levels have resulted in a range of taste and strength within the pale ale family. " +
                "Such as: Amber Ale, American Pale Ale, Biere de Garde, Burton Pale Ale, English Bitter, Irish Red Ale, Scotch Ale, and Strong Pale Ale.");

        description.add("Stout is a dark, top-fermented beer with a number of variations, including dry stout, Baltic porter, milk stout, and imperial stout.");

        description.add("Porter is a style of beer that was developed in London, England in the early eighteenth century. " +
                "It was well-hopped and dark in appearance due to the use of brown malt. " +
                "The name originated due to its popularity with street and river porters." +
                "The popularity of porter was significant, and it became the first beer style to be brewed across the world, and production had commenced in Ireland, North America, Sweden and Russia by the end of the eighteenth century.");

        adapter.addData(titles, history, description);
    }

    public void onNameClick(int position){
        Intent intent = new Intent(this, Main2Activity.class);

        intent.putExtra("Title", titles.get(position));
        intent.putExtra("History", history.get(position));
        intent.putExtra("Description", description.get(position));

        startActivity(intent);
    }

}