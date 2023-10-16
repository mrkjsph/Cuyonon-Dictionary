package com.example.cuyo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.SearchView;

import java.util.ArrayList;

public class srch extends AppCompatActivity {

    ListView listView;
    ListViewAdapter adapter;
    String[] title;
    ArrayList<Model> arrayList = new ArrayList<Model>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_srch);

        title = new String[]{
                "Abaga", "Abaka", "Abo", "Adal", "Adin Sadin", "Adlaw", "Adlik", "Alibangbang", "Alima", "Alo",
                "Ambe", "Amimirek", "Amo", "Anay", "Anem", "Angin", "Anino", "Anono", "Apat", "Apog",
                "Apok", "Apon", "Ara", "Aran", "Aroman", "Asawa", "Asin", "Aso", "Atay", "Atep", "Awid", "Ayam",
                "Baag", "Baba", "Babai", "Baboy", "Baga", "Bago", "Bakal", "Balangaw", "Balay", "Balikawang",
                "Balongbabai", "Banga", "Banig", "Banios", "Baras", "Barita", "Baroto", "Basa", "Bata", "Batis",
                "Bato", "Baybay", "Bayo", "Bedbed", "Begat", "Begsay", "Bengel", "Beteng", "Bilalaybirat", "Bilanga",
                "Birdi", "Biring", "Bisaralimeg", "Biton", "Boatybanig", "Boaya", "Bokid", "Bolan", "Boli", "Bolong",
                "Bonak", "Bonga", "Bono", "Book", "Bool", "Boray", "Boslososo", "Bosog", "Botig", "Boyo", "Bugtitinae",
                "Bunga", "Burak", "Dadi", "Dadi_ren", "Dagat", "Dai", "Dalanbanasbanas", "Damang", "Daon", "Dapaw",
                "Darwa", "Darwampulo", "Degan", "Digos", "Dila", "Dingding", "Dogo", "Doro", "Elat", "Eseb", "Eya",
                "Eyep", "Gabi", "Gakitbalsa", "Galem", "Galon", "Gamot", "Gatos", "Geretgeret", "Getem", "Gorang",
                "Gosok", "Iba", "Idalem", "Idalembalay", "Igot", "Ikog", "Inem", "Ipen", "Irinemen", "Irong", "Isda",
                "Istoria", "Itlog", "Itsura", "Kabati", "Kadlaw", "Kaen", "Kagat", "Kaimamot", "Kalatkabli", "Kalayo",
                "Kalilies", "Kalkag", "Kalot", "Kamote", "Kano", "Kaoy", "Kapon", "Karabaw", "Karawat", "Kardiro",
                "Kasaplan", "Katorog", "Katulong", "Kaybanmadu", "Kilala", "Kilat", "Koan", "Kodal", "Koko", "Kolit",
                "Kong", "Kotkot", "Koto", "Labeg", "Laen", "Lagpak", "Lalagona", "Lalaki", "Lamgam", "Langaw", "Langit",
                "Lawas", "Lebeng", "Leig", "Likod", "Lima", "Lintidageb", "Linug", "Lipat", "Loa", "Loag", "Lobid",
                "Logta", "Lokon", "Longmok", "Losong", "Loya", "Maamot", "Maayad", "Mabael", "Mabaskeg", "Mabol",
                "Maboring", "Mabui", "Madalem", "Madamel", "Madasig", "Madolaw", "Madura", "Magbayad", "Magdalagan",
                "Magkal", "Magkalipot", "Maglepad", "Magloto", "Magpandora", "Mainit", "Maite", "Makatel", "Makori",
                "Malam", "Malapad", "Malinang_linang", "Mani", "Manipis", "Maniwang", "Manok", "Mapait", "Mapiet",
                "Mapungaw", "Mara", "Marapit", "Marimo", "Maroya", "Maslem", "Mata", "Mataged", "Matambok", "Matamis",
                "Matarem", "Matas", "Mga_bata", "Namok", "Nanay", "Nganga", "Ngitit", "Nipa", "Obo", "Ogtong_adlaw",
                "Olas", "Olibalik", "Olit", "Ololonan", "Oon", "Opa", "Oran", "Oring", "Osa", "Osay", "Oslon",
                "Otang", "Otok", "Owaw", "Oyen", "Pabakal", "Pakpak", "Palad", "Palay", "Pali", "Pamaw", "Panaw",
                "Pangalamo", "Panganod", "Pangi", "Pangka", "Paray", "Paribanaw", "Patay", "Pawikan", "Pilak", "Pilak_an",
                "Pili", "Pinakaubongtalipuspusan", "Pirakabilog", "Pisil", "Pito", "Pohol", "Pola", "Ponaspaid",
                "Poti", "Puno", "Pusun", "Putot", "Ramig", "Rapa_rapa", "Raye", "Ronot", "Sabat", "Saging", "Saka",
                "Sakit", "Saleg", "Sampolo", "Seleng", "Sepsep", "Siam", "Sidlangan", "Siitaladang", "Silag", "Singsing",
                "Sino", "Sipa", "Soba", "Soka", "Sonog", "Suay", "Suiko", "Tadleng", "Tageban", "Taginep", "Tago", "Tai",
                "Takaw", "Talinga", "Tanan", "Tanem", "Tangis", "Tao", "Tarong", "Tasik", "Tatay", "Tatlo", "Tawag",
                "Tebeg", "Telen", "Tian", "Tigas", "Timid", "Timprano", "Tinai", "Tindeg", "Tingway", "Tio", "Tobig",
                "Tobo", "Todlo", "Tolan", "Tolod", "Too", "Tood", "Ulu", "Wak", "Wala", "Walo"
        };


        listView = findViewById(R.id.listView);

        for (int i = 0; i<title.length; i++) {
            Model model = new Model(title[i]);
            arrayList.add(model);
        }

        adapter = new ListViewAdapter(this,arrayList);
        listView.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);

        MenuItem myActionMenuItem = menu.findItem(R.id.action_search);
        SearchView searchView = (SearchView) myActionMenuItem.getActionView();
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener(){

            @Override
            public boolean onQueryTextChange(String s) {
                adapter.filter(s);
                return true;
            }

            @Override
            public boolean onQueryTextSubmit (String s){
                        if (TextUtils.isEmpty(s)) {
                            adapter.filter("");
                            listView.clearTextFilter();
                        }
                        else {
                                adapter.filter(s);
                            }

                return true;
            }
        });
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        return super.onOptionsItemSelected(item);
    }
}
/*design row of listView
* adding menu to add searchView in actionbar*/










