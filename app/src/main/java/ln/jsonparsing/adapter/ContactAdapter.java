package ln.jsonparsing.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

import ln.jsonparsing.R;

/**
 * Created by comp-1 on 2/2/17.
 */

public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.MyViewHolder> {

    ArrayList<HashMap<String, String>> contactList;

    public ContactAdapter(Context context, ArrayList<HashMap<String, String>> contactList) {

        this.contactList = contactList;

    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        public TextView txtName, txtEmail, txtMobile;

        public MyViewHolder(View itemView) {
            super(itemView);

            txtName = (TextView) itemView.findViewById(R.id.txt_name);
            txtEmail = (TextView) itemView.findViewById(R.id.txt_email);
            txtMobile = (TextView) itemView.findViewById(R.id.txt_mobile);

        }
    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_contact, parent, false);

        return new MyViewHolder(itemView);
    }


    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        holder.txtName.setText(contactList.get(position).get("name"));
        holder.txtEmail.setText(contactList.get(position).get("email"));
        holder.txtMobile.setText(contactList.get(position).get("mobile"));

    }

    @Override
    public int getItemCount() {
        return contactList.size();
    }
}
