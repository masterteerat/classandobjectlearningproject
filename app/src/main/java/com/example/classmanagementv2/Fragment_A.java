package com.example.classmanagementv2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Fragment_A#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Fragment_A extends Fragment {
    protected DataProductLine[] mDataset;
    protected RecyclerView mRecyclerView;
    protected CustomAdapter mAdapter;
    protected RecyclerView.LayoutManager mLayoutManager;
    protected LayoutManagerType mCurrentLayoutManagerType;

    private enum LayoutManagerType {
        LINEAR_LAYOUT_MANAGER
    }

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Fragment_A() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Fragment_A.
     */
    // TODO: Rename and change types and number of parameters
    public static Fragment_A newInstance(String param1, String param2) {
        Fragment_A fragment = new Fragment_A();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initDataset();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_a, container, false);
        mRecyclerView = (RecyclerView) rootView.findViewById(R.id.recyclerView);
        mLayoutManager = new LinearLayoutManager(getActivity());
        mRecyclerView = (RecyclerView) rootView.findViewById(R.id.recyclerView);
        mLayoutManager = new LinearLayoutManager(getActivity());
        mCurrentLayoutManagerType = LayoutManagerType.LINEAR_LAYOUT_MANAGER;
        if (savedInstanceState != null) {
            mCurrentLayoutManagerType = (LayoutManagerType) savedInstanceState
                    .getSerializable("layoutManager");
        }

        int scrollPosition = 0;
        if (mRecyclerView.getLayoutManager() != null) {
            scrollPosition = ((LinearLayoutManager) mRecyclerView.getLayoutManager())
                    .findFirstCompletelyVisibleItemPosition();
        }

        mLayoutManager = new LinearLayoutManager(getActivity());
        mCurrentLayoutManagerType = LayoutManagerType.LINEAR_LAYOUT_MANAGER;
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.scrollToPosition(scrollPosition);
        mAdapter = new CustomAdapter(mDataset);
        mRecyclerView.setAdapter(mAdapter);


        return rootView;
    }

    private void initDataset() {
        mDataset = new DataProductLine[9];

        mDataset[0] = new DataProductLine("0000", R.drawable.pd_coke, "โค้ก + น้ำเเข็ง", 1, 25.0, 0.0, "enqueue");
        mDataset[1] = new DataProductLine("0001", R.drawable.pd_coffee, "กาเเฟเย็นปั่น", 1, 35.0, 0.0, "enqueue");
        mDataset[2] = new DataProductLine("0002", R.drawable.pd_coffee2, "กาเเฟเย็น", 1, 30.0, 0.0, "enqueue");
        mDataset[3] = new DataProductLine("0003", R.drawable.pd_bluebery, "บลูเบอร์รีปั่น", 1, 35.0, 0.0, "enqueue");
        mDataset[4] = new DataProductLine("0004", R.drawable.pd_banana, "กล้วยปั่น", 1, 30.0, 0.0, "enqueue");
        mDataset[5] = new DataProductLine("0005", R.drawable.pd_greentea, "ชาเขียวเย็น", 1, 35.0, 0.0, "enqueue");
        mDataset[6] = new DataProductLine("0006", R.drawable.pd_lemonjuice, "น้ำมะนาวเย็น", 1, 30.0, 0.0, "enqueue");
        mDataset[7] = new DataProductLine("0007", R.drawable.pd_melon, "น้ำเมล่อน", 1, 40.0, 0.0, "enqueue");
        mDataset[8] = new DataProductLine("0008", R.drawable.pd_watermelon, "น้ำเเตงโม", 1, 35.0, 0.0, "enqueue");

    }

}