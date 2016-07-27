package com.peacecorps.pcmalariaprevention;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A placeholder fragment containing a simple view.
 */
public class InfoHubActivityFragment extends Fragment {

    private static final String ARG_SECTION_NUMBER = "section_number";

    public InfoHubActivityFragment() {
    }

    public static InfoHubActivityFragment newInstance(int sectionNumber) {
        InfoHubActivityFragment fragment = new InfoHubActivityFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_info_hub, container, false);
    }
}
