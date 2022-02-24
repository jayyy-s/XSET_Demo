package demo.xset.xset_demo.watch;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import demo.xset.xset_demo.ItemSpacingDecorator;
import demo.xset.xset_demo.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link WatchFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class WatchFragment extends Fragment {

    // Add RecyclerView member
    private RecyclerView recyclerView;
    private ArrayList<WatchItemCard> watchItemCardList;


    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public WatchFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ShopFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static WatchFragment newInstance(String param1, String param2) {
        WatchFragment fragment = new WatchFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_watch, container, false);

        Spinner spinner = (Spinner) view.findViewById(R.id.gameTitleSpinner);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this.getActivity(), R.array.game_titles_array, R.layout.spinner_selected_item);
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinner.setAdapter(adapter);


        watchItemCardList = new ArrayList<>();


        WatchItemCard item1 = new WatchItemCard(R.drawable.halo_icon, "February 24", "5:00PM EST", "https://www.twitch.tv/Halo");
        WatchItemCard item2 = new WatchItemCard(R.drawable.valorant_icon, "February 26", "7:00PM EST", "https://www.twitch.tv/valorant");
        WatchItemCard item3 = new WatchItemCard(R.drawable.apex_symbol, "February 27", "5:00PM EST", "https://www.twitch.tv/playapex");
        WatchItemCard item4 = new WatchItemCard(R.drawable.apex_symbol, "March 5", "5:00PM EST", "https://www.twitch.tv/playapex");
        WatchItemCard item5 = new WatchItemCard(R.drawable.valorant_icon, "March 6", "4:00PM EST", "https://www.twitch.tv/playapex");
        WatchItemCard item6 = new WatchItemCard(R.drawable.pubg_icon_orange, "March 18", "TBA", "https://www.twitch.tv/pubgmobileesports");

        watchItemCardList.add(item1);
        watchItemCardList.add(item2);
        watchItemCardList.add(item3);
        watchItemCardList.add(item4);
        watchItemCardList.add(item5);
        watchItemCardList.add(item6);
        watchItemCardList.add(item2);
        watchItemCardList.add(item3);
        watchItemCardList.add(item6);
        watchItemCardList.add(item1);
        watchItemCardList.add(item5);
        watchItemCardList.add(item4);


        // Add the following lines to create RecyclerView
        recyclerView = view.findViewById(R.id.recyclerView2);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
        ItemSpacingDecorator decorator = new ItemSpacingDecorator(10);
        recyclerView.addItemDecoration(decorator);

        recyclerView.setAdapter(new WatchAdapter(watchItemCardList, this.getActivity()));

        return view;
    }
}