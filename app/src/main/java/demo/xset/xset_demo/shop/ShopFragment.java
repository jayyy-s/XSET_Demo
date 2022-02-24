package demo.xset.xset_demo.shop;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import demo.xset.xset_demo.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ShopFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ShopFragment extends Fragment {

    // Add RecyclerView member
    private RecyclerView recyclerView;
    private ArrayList<ShopItemCard> shopItemCardList;


    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public ShopFragment() {
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
    public static ShopFragment newInstance(String param1, String param2) {
        ShopFragment fragment = new ShopFragment();
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

        shopItemCardList = new ArrayList<>();


        ShopItemCard item1 = new ShopItemCard(R.drawable.lst_white_front, "THE SET SCOPE LS", "$35");
        ShopItemCard item2 = new ShopItemCard(R.drawable.text_navy_beanie, "XSET TEXT CUFF BEANIE", "$18");
        ShopItemCard item3 = new ShopItemCard(R.drawable.connected_hoodie, "CONNECTED HOODIE", "$120");
        ShopItemCard item4 = new ShopItemCard(R.drawable.blocked_crew_red, "BLOCKED CREWNECK", "$120");
        ShopItemCard item5 = new ShopItemCard(R.drawable.black_sweatpants, "CONNECTED SWEATPANTS", "$115");
        ShopItemCard item6 = new ShopItemCard(R.drawable.sock_black, "LOGO PERFORMANCE SOCK", "$6");
        ShopItemCard item7 = new ShopItemCard(R.drawable.sock_white, "LOGO PERFORMANCE SOCK", "$6");
        ShopItemCard item8 = new ShopItemCard(R.drawable.connected_hoodie_gray, "CONNECTED HOODIE", "$120");
        shopItemCardList.add(item1);
        shopItemCardList.add(item2);
        shopItemCardList.add(item8);
        shopItemCardList.add(item4);
        shopItemCardList.add(item3);
        shopItemCardList.add(item5);
        shopItemCardList.add(item6);
        shopItemCardList.add(item7);


        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_shop, container, false);

        // Add the following lines to create RecyclerView
        recyclerView = view.findViewById(R.id.recyclerView1);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new GridLayoutManager(view.getContext(), 2));

        recyclerView.setAdapter(new ShopAdapter(shopItemCardList, this.getActivity()));

        return view;
    }
}