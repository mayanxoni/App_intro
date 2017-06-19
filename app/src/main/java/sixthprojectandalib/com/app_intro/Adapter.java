package sixthprojectandalib.com.app_intro;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by hp on 6/17/2017.
 */
public class Adapter  extends BaseAdapter implements Filterable {

    Context c;
    ArrayList<First> players;
    CustomFilter filter;
    ArrayList<First> filterList;
    public Adapter(Context ctx,ArrayList<First> players) {
        // TODO Auto-generated constructor stub
        this.c=ctx;
        this.players=players;
        this.filterList=players;
    }
    public int getCount() {
        // TODO Auto-generated method stub
        return players.size();
    }
    public Object getItem(int pos) {
        // TODO Auto-generated method stub
        return players.get(pos);
    }
    public long getItemId(int pos) {
        // TODO Auto-generated method stub
        return players.indexOf(getItem(pos));
    }
    public View getView(int pos, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub
        LayoutInflater inflater=(LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if(convertView==null)
        {
            convertView=inflater.inflate(R.layout.second, null);
        }
        TextView nameTxt=(TextView) convertView.findViewById(R.id.nameTv);
        ImageView img=(ImageView) convertView.findViewById(R.id.imageView1);
        TextView text=(TextView) convertView.findViewById(R.id.nameTv1);
        //SET DATA TO THEM
        nameTxt.setText(players.get(pos).getName());
        img.setImageResource(players.get(pos).getImg());
        text.setText(players.get(pos).getText());
        return convertView;
    }

    public Filter getFilter() {
        // TODO Auto-generated method stub
        if(filter == null)
        {
            filter=new CustomFilter();
        }
        return filter;
    }
    //INNER CLASS
    class CustomFilter extends Filter
    {
        @Override
        protected FilterResults performFiltering(CharSequence constraint) {
            // TODO Auto-generated method stub
            FilterResults results=new Filter.FilterResults();
            if(constraint != null && constraint.length()>0)
            {
                //CONSTARINT TO UPPER
                constraint=constraint.toString().toUpperCase();
                ArrayList<First> filters=new ArrayList<First>();
                //get specific items
                for(int i=0;i<filterList.size();i++)
                {
                    if(filterList.get(i).getName().toUpperCase().contains(constraint))
                    {
                        First p=new First(filterList.get(i).getName(), filterList.get(i).getImg(),filterList.get(i).getText());
                        filters.add(p);
                    }
                }
                results.count=filters.size();
                results.values=filters;
            }else
            {
                results.count=filterList.size();
                results.values=filterList;
            }
            return results;
        }
        protected void publishResults(CharSequence constraint, FilterResults results) {
            // TODO Auto-generated method stub
            players=(ArrayList<First>) results.values;
            notifyDataSetChanged();
        }
    }
}