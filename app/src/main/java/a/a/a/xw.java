package a.a.a;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.besome.sketch.beans.ProjectFileBean;
import com.besome.sketch.beans.ViewBean;
import com.besome.sketch.editor.manage.view.ManageViewActivity;
import com.besome.sketch.editor.manage.view.PresetSettingActivity;

import java.util.ArrayList;
import java.util.Iterator;

import bro.sketchware.R;

public class xw extends qA {

    public RecyclerView f;
    public String g;
    public ArrayList<ProjectFileBean> h = new ArrayList<>();
    public Adapter i = null;
    public Boolean j = false;
    public TextView k;
    public int[] l = new int[19];

    public final String a(int beanType, String xmlName) {
        String baseName = wq.b(beanType);
        StringBuilder nameBuilder = new StringBuilder();
        nameBuilder.append(baseName);
        int[] nameCounters = l;
        int counter = nameCounters[beanType] + 1;
        nameCounters[beanType] = counter;
        nameBuilder.append(counter);
        String newName = nameBuilder.toString();
        ArrayList<ViewBean> viewBeans = jC.a(g).d(xmlName);
        xmlName = newName;

        while (true) {
            boolean nameExists = false;
            for (ViewBean viewBean : viewBeans) {
                if (xmlName.equals(viewBean.id)) {
                    nameExists = true;
                    break;
                }
            }

            if (!nameExists) {
                return xmlName;
            }

            nameBuilder = new StringBuilder();
            nameBuilder.append(baseName);
            counter = nameCounters[beanType] + 1;
            nameCounters[beanType] = counter;
            nameBuilder.append(counter);
            xmlName = nameBuilder.toString();
        }
    }

    public final ArrayList<ViewBean> a(String var1, int var2) {
        ArrayList<ViewBean> var3 = new ArrayList<>();
        ArrayList<ViewBean> var4;
        if (var2 != 277) {
            if (var2 != 278) {
                var4 = var3;
            } else {
                var4 = rq.d(var1);
            }
        } else {
            var4 = rq.b(var1);
        }

        return var4;
    }

    public void a(ProjectFileBean projectFileBean) {
        h.add(projectFileBean);
        i.notifyDataSetChanged();
    }

    public void a(String fileName) {
        Iterator<ProjectFileBean> projectFiles = h.iterator();

        boolean fileAlreadyExists;
        while (true) {
            if (projectFiles.hasNext()) {
                ProjectFileBean fileBean = projectFiles.next();
                if (fileBean.fileType != 2 || !fileBean.fileName.equals(fileName)) {
                    continue;
                }
                fileAlreadyExists = true;
                break;
            }
            fileAlreadyExists = false;
            break;
        }

        if (!fileAlreadyExists) {
            h.add(new ProjectFileBean(2, fileName));
            i.notifyDataSetChanged();
        }

    }

    public void a(boolean var1) {
        j = var1;
        e();
        i.notifyDataSetChanged();
    }

    public void b(String var1) {
        for (ProjectFileBean var3 : h) {
            if (var3.fileType == 2 && var3.fileName.equals(var1)) {
                h.remove(var3);
                break;
            }
        }
        i.notifyDataSetChanged();
    }

    public ArrayList<ProjectFileBean> c() {
        return h;
    }

    public void d() {
        ArrayList<ProjectFileBean> files = jC.b(g).c();
        if (files != null) {
            h.addAll(files);
        }
    }

    public final void e() {
        for (ProjectFileBean projectFileBean : h) {
            projectFileBean.isSelected = false;
        }
    }

    public void f() {
        int var1 = h.size();

        while (true) {
            int var2 = var1 - 1;
            if (var2 < 0) {
                i.notifyDataSetChanged();
                return;
            }

            var1 = var2;
            if (h.get(var2).isSelected) {
                h.remove(var2);
                var1 = var2;
            }
        }
    }

    public void g() {
        if (h != null) {
            if (h.isEmpty()) {
                k.setVisibility(View.VISIBLE);
                f.setVisibility(View.GONE);
            } else {
                k.setVisibility(View.GONE);
                f.setVisibility(View.VISIBLE);
            }
        }
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        if (savedInstanceState == null) {
            d();
        } else {
            g = savedInstanceState.getString("sc_id");
            h = savedInstanceState.getParcelableArrayList("custom_views");
        }

        f.getAdapter().notifyDataSetChanged();
        g();
    }

    @Override
    public void onActivityResult(int var1, int var2, Intent var3) {
        if ((var1 == 277 || var1 == 278) && var2 == -1) {
            ProjectFileBean var4 = h.get(i.c);
            ArrayList<ViewBean> var5 = jC.a(g).d(var4.getXmlName());

            for (int var7 = var5.size() - 1; var7 >= 0; --var7) {
                ViewBean var6 = var5.get(var7);
                jC.a(g).a(var4, var6);
            }

            ArrayList<ViewBean> var8 = a(((ProjectFileBean) var3.getParcelableExtra("preset_data")).presetName, var1);
            jC.a(g);

            for (ViewBean viewBean : eC.a(var8)) {
                viewBean.id = a(viewBean.type, var4.getXmlName());
                jC.a(g).a(var4.getXmlName(), viewBean);
                if (viewBean.type == 3 && var4.fileType == 0) {
                    jC.a(g).a(var4.getJavaName(), 1, viewBean.type, viewBean.id, "onClick");
                }
            }

            i.notifyItemChanged(i.c);
        }

    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ViewGroup viewGroup = (ViewGroup) inflater.inflate(R.layout.fr_manage_view_list, container, false);
        f = viewGroup.findViewById(R.id.list_activities);
        f.setHasFixedSize(true);
        f.setLayoutManager(new LinearLayoutManager(getContext()));
        i = new Adapter(f);
        f.setAdapter(i);
        if (savedInstanceState == null) {
            g = getActivity().getIntent().getStringExtra("sc_id");
        } else {
            g = savedInstanceState.getString("sc_id");
        }

        k = viewGroup.findViewById(R.id.tv_guide);
        k.setText(xB.b().a(getActivity(), R.string.design_manager_view_description_guide_create_custom_view));
        return viewGroup;
    }

    @Override
    public void onSaveInstanceState(Bundle var1) {
        var1.putString("sc_id", g);
        var1.putParcelableArrayList("custom_views", h);
        super.onSaveInstanceState(var1);
    }

    public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

        public int c;

        public Adapter(RecyclerView recyclerView) {
            c = -1;
            if (recyclerView.getLayoutManager() instanceof LinearLayoutManager) {
                recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {
                    @Override
                    public void onScrolled(@NonNull RecyclerView rv, int dx, int dy) {
                        super.onScrolled(rv, dx, dy);
                        if (dy > 2) {
                            if (((ManageViewActivity) getActivity()).s.isEnabled()) {
                                ((ManageViewActivity) getActivity()).s.hide();
                            }
                        } else if (dy < -2 && ((ManageViewActivity) getActivity()).s.isEnabled()) {
                            ((ManageViewActivity) getActivity()).s.show();
                        }
                    }
                });
            }
        }

        @Override
        public int getItemCount() {
            return h != null ? h.size() : 0;
        }

        @Override
        public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
            if (j) {
                holder.x.setVisibility(View.VISIBLE);
                holder.u.setVisibility(View.GONE);
            } else {
                holder.x.setVisibility(View.GONE);
                holder.u.setVisibility(View.VISIBLE);
            }

            ProjectFileBean fileBean = h.get(position);
            holder.u.setImageResource(R.drawable.activity_preset_1);
            holder.t.setChecked(fileBean.isSelected);
            if (fileBean.fileType == 1) {
                holder.w.setText(fileBean.getXmlName());
            } else if (fileBean.fileType == 2) {
                holder.t.setVisibility(View.GONE);
                holder.u.setImageResource(R.drawable.activity_0110);
                holder.w.setText(fileBean.fileName.substring(1));
            }

            if (fileBean.isSelected) {
                holder.v.setImageResource(R.drawable.ic_checkmark_green_48dp);
            } else {
                holder.v.setImageResource(R.drawable.ic_trashcan_white_48dp);
            }

        }

        @Override
        @NonNull
        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.manage_view_custom_list_item, parent, false));
        }

        public class ViewHolder extends RecyclerView.ViewHolder {

            public CheckBox t;
            public ImageView u;
            public ImageView v;
            public TextView w;
            public LinearLayout x;
            public ImageView y;

            public ViewHolder(View itemView) {
                super(itemView);
                t = itemView.findViewById(R.id.chk_select);
                u = itemView.findViewById(R.id.img_activity);
                w = itemView.findViewById(R.id.tv_screen_name);
                x = itemView.findViewById(R.id.delete_img_container);
                v = itemView.findViewById(R.id.img_delete);
                y = itemView.findViewById(R.id.img_preset_setting);
                t.setVisibility(View.GONE);
                itemView.setOnClickListener(view -> {
                    c = getLayoutPosition();
                    if (j) {
                        t.setChecked(!t.isChecked());
                        h.get(c).isSelected = t.isChecked();
                        notifyItemChanged(c);
                    }
                });
                itemView.setOnLongClickListener(v -> {
                    ((ManageViewActivity) getActivity()).a(true);
                    c = getLayoutPosition();
                    t.setChecked(!t.isChecked());
                    h.get(c).isSelected = t.isChecked();
                    return true;
                });
                y.setOnClickListener(view -> {
                    if (!mB.a()) {
                        c = getLayoutPosition();
                        Intent var4 = new Intent(getActivity(), PresetSettingActivity.class);
                        int requestCode;
                        if (h.get(c).fileType == 1) {
                            requestCode = 277;
                        } else {
                            requestCode = 278;
                        }

                        var4.putExtra("request_code", requestCode);
                        var4.putExtra("edit_mode", true);
                        startActivityForResult(var4, requestCode);
                    }
                });
            }
        }
    }
}
