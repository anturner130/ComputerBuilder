package comp640.computerbuilder.logic;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import comp640.computerbuilder.R;

import comp640.computerbuilder.fragments.listeners.OnListFragmentInteractionListener;
import comp640.computerbuilder.model.build.Build;
import comp640.computerbuilder.model.parts.Part;
import comp640.computerbuilder.model.parts.PartType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**

 * TODO: Replace the implementation with code for your data type.
 * TODO: Research custom list adapter and implement it to work with part.
 * TODO: Make generic enough to handle different kinds of parts
 * TODO: Replace "DummyItem" with a class that represents a part
 */
public class BreakdownViewAdapter extends RecyclerView.Adapter<BreakdownViewAdapter.ViewHolder> {

    private final List<PartType> _values;
    private final Build _build;
    private final OnListFragmentInteractionListener _listener;

    public BreakdownViewAdapter(Build build, OnListFragmentInteractionListener listener) {
        _values = new ArrayList<PartType>(Arrays.asList(PartType.values()));
        _build = build;
        _listener = listener;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fragment_breakdown_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {
        holder._item = _values.get(position);
        holder._titleView.setText(holder._item.toString());

        if(_build != null && holder._item != null)
        {
            Part part = _build.getPart(holder._item);
            if(part != null){
                List<Part> parts = new ArrayList<>();
                parts.add(part);
                PartViewAdapter adapter = new PartViewAdapter(parts,null);
                PartViewAdapter.ViewHolder viewHolder = adapter.onCreateViewHolder(
                        (ViewGroup) holder._view, 0);
                adapter.onBindViewHolder(viewHolder,0);
                holder._partView.addView(viewHolder.mView);
            }
        }



        holder._view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (null != _listener) {
                    // Notify the active callbacks interface (the activity, if the
                    // fragment is attached to one) that an item has been selected.
                    _listener.onInteraction(holder, position);
                }
            }
        });
    }


    @Override
    public int getItemCount() {
        return _values.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public final View _view;
        public final TextView _titleView;
        public LinearLayout _partView;
        public PartType _item;

        public ViewHolder(View view) {
            super(view);
            _view = view;
            _titleView = (TextView) view.findViewById(R.id.title);
            _partView = (LinearLayout)view.findViewById(R.id.partView);

        }

        @Override
        public String toString() {
            return super.toString() + " '" + _titleView.getText() + "'";
        }
    }
}
