package com.example.cselearningportalhstu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.cselearningportalhstu.Model.Users;
import com.example.cselearningportalhstu.Prevalent.Prevalent;

//import com.example.arbonlineshop.ViewHolder.ProductViewHolder;
import com.example.cselearningportalhstu.Prevalent.Prevalent;
//import com.firebase.ui.database.FirebaseRecyclerAdapter;
//import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.snackbar.Snackbar;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.squareup.picasso.Picasso;

import org.jetbrains.annotations.NotNull;

import de.hdodenhof.circleimageview.CircleImageView;
import io.paperdb.Paper;

public class HomeActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{

    DrawerLayout drawerLayout;
    Toolbar toolbar;
    NavigationView navigationView;
    CardView l1s1,l1s2,l2s1,l2s2,l3s1,l3s2,l4s1,l4s2,extra,coment;

  /*  private DatabaseReference productRef;
    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

      /*  productRef= FirebaseDatabase.getInstance().getReference().child("Products");
        recyclerView=(RecyclerView) findViewById(R.id.recycler_menu);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);*/

        l1s1=(CardView)findViewById(R.id.cv1);
        l1s2=(CardView)findViewById(R.id.cv2);
        l2s1=(CardView)findViewById(R.id.cv3);
        l2s2=(CardView)findViewById(R.id.cv4);
        l3s1=(CardView)findViewById(R.id.cv5);
        l3s2=(CardView)findViewById(R.id.cv6);
        l4s1=(CardView)findViewById(R.id.cv7);
        l4s2=(CardView)findViewById(R.id.cv8);
        extra=(CardView)findViewById(R.id.cv9);
        coment=(CardView)findViewById(R.id.cv10);

        l1s1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(HomeActivity.this,Level1Sem1.class);
                startActivity(intent);

            }
        });

        l1s2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(HomeActivity.this,Level1Sem2.class);
                startActivity(intent);

            }
        });

        l2s1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(HomeActivity.this,Level2Sem1.class);
                startActivity(intent);

            }
        });

        l2s2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(HomeActivity.this,Level2Sem2.class);
                startActivity(intent);

            }
        });


        l3s1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(HomeActivity.this,Level3Sem1.class);
                startActivity(intent);

            }
        });


        l3s2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(HomeActivity.this,Level3Sem2.class);
                startActivity(intent);

            }
        });

        l4s1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(HomeActivity.this,Level4Sem1.class);
                startActivity(intent);

            }
        });

        l4s2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(HomeActivity.this,Level4Sem2.class);
                startActivity(intent);

            }
        });

        extra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(HomeActivity.this,Extra.class);
                startActivity(intent);

            }
        });

        coment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(HomeActivity.this,VisitingSite.class);
                intent.putExtra("url","https://drive.google.com/drive/folders/17BtNytu1VWjMk-g92R1qQxTxYV4l6F3l?usp=sharing");
                startActivity(intent);

            }
        });





        Paper.init(this);

        drawerLayout=(DrawerLayout)findViewById(R.id.nav_view_ki_jani);
        toolbar=(Toolbar)findViewById(R.id.toolbar);
        navigationView=(NavigationView)findViewById(R.id.navigation_view);
      //  FloatingActionButton fab=(FloatingActionButton)findViewById(R.id.fab);

        toolbar.setTitle("Home");

        /*fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "This is main activity", Snackbar.LENGTH_LONG)
                        .setAction("CLOSE",null)
                        .show();
            }
        });*/

        navigationView.setNavigationItemSelectedListener(this);

        View headerView=navigationView.getHeaderView(0);
        TextView userNameTextView=headerView.findViewById(R.id.user_profile_name);
        CircleImageView profileImageView=headerView.findViewById(R.id.user_profile_image);

        userNameTextView.setText(Prevalent.currentOnlineUser.getName());

        Picasso.get().load(Prevalent.currentOnlineUser.getImage()).placeholder(R.drawable.profile).into(profileImageView);

        ActionBarDrawerToggle toggle=new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.navigation_drawer_open,R.string.navigation_drawer_close);

        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

    }

  /*  @Override
    protected void onStart() {
        super.onStart();


        FirebaseRecyclerOptions<Products> optoins=new FirebaseRecyclerOptions.Builder<Products>().setQuery(productRef,Products.class).build();

        FirebaseRecyclerAdapter<Products, ProductViewHolder> adapter=new FirebaseRecyclerAdapter<Products, ProductViewHolder>(optoins) {
            @Override
            protected void onBindViewHolder(@NonNull @NotNull ProductViewHolder productViewHolder, int i, @NonNull @NotNull Products products) {
                productViewHolder.txtProductName.setText(products.getPname());
                productViewHolder.txtProductDescription.setText(products.getDescription());
                productViewHolder.txtProductPrice.setText("Price = "+products.getPrice()+"taka");
                Picasso.get().load(products.getImage()).into(productViewHolder.imageView);
            }

            @NonNull
            @NotNull
            @Override
            public ProductViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
                View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.product_items_layout,parent,false);
                ProductViewHolder holder=new ProductViewHolder(view);
                return holder;
            }
        };

        recyclerView.setAdapter(adapter);
        adapter.startListening();
    }*/

    @Override
    public boolean onNavigationItemSelected(@NonNull @NotNull MenuItem item) {

        int menuId=item.getItemId();


        if(menuId==R.id.nav_logout)
        {
            Toast.makeText(HomeActivity.this, "Logout pressed", Toast.LENGTH_SHORT).show();
            Paper.book().destroy();
            Intent intent=new Intent(HomeActivity.this,MainActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(intent);
            finish();
        }
        else if(menuId==R.id.nav_setting)
        {
            Toast.makeText(HomeActivity.this, "user Profile pressed", Toast.LENGTH_SHORT).show();

            Intent intent=new Intent(HomeActivity.this,UserProfile.class);
            startActivity(intent);

        }
        else if(menuId==R.id.nav_all)
        {
            Toast.makeText(HomeActivity.this, "nav all pressed for all courses", Toast.LENGTH_SHORT).show();
            Intent intent=new Intent(HomeActivity.this,AllCourses.class);
            startActivity(intent);
        }
        else if(menuId==R.id.nav_questions)
        {
            Toast.makeText(HomeActivity.this, "Nav questions pressed for all question", Toast.LENGTH_SHORT).show();

            Intent intent=new Intent(HomeActivity.this,AllQuestions.class);
            startActivity(intent);


        }
        else if(menuId==R.id.catagories)
        {
            Toast.makeText(HomeActivity.this, "catagories pressed", Toast.LENGTH_SHORT).show();
            Intent intent=new Intent(HomeActivity.this,Categories.class);
            startActivity(intent);
        }
        else if(menuId==R.id.nav_about_us)
        {
            Toast.makeText(HomeActivity.this, "about us pressed, our info will show", Toast.LENGTH_SHORT).show();

            Intent intent=new Intent(HomeActivity.this,AboutUs.class);
            startActivity(intent);
        }
        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onBackPressed() {


        if(drawerLayout.isDrawerOpen(GravityCompat.START))
        {
            drawerLayout.closeDrawer(GravityCompat.START);
        }
        else
            super.onBackPressed();
    }
}