package com.example.librarysystem;

import static com.example.librarysystem.login.lOB;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.pranavpandey.android.dynamic.toasts.DynamicToast;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class BookDetails extends AppCompatActivity {

    // creating variables for strings,text view, image views and button.
    String title, subtitle, publisher, publishedDate, description, genre;
    int pageCount;
    private ArrayList<String> authors;

    TextView titleTV, subtitleTV, publisherTV, descTV, pageTV, publishDateTV;
    Button previewBtn, buyBtn;
    private ImageView bookIV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_details);

        // initializing our views..
        titleTV = findViewById(R.id.idTVTitle);
        subtitleTV = findViewById(R.id.idTVSubTitle);
        publisherTV = findViewById(R.id.idTVpublisher);
        descTV = findViewById(R.id.idTVDescription);
        pageTV = findViewById(R.id.idTVNoOfPages);
        publishDateTV = findViewById(R.id.idTVPublishDate);
        previewBtn = findViewById(R.id.idBtnPreview);
        buyBtn = findViewById(R.id.idBtnBuy);


        // getting the data which we have passed from our adapter class.
        title = getIntent().getStringExtra("title");

        publisher = getIntent().getStringExtra("publisher");
        subtitle = getIntent().getStringExtra("authors");
        publishedDate = getIntent().getStringExtra("publishedDate");
        description = getIntent().getStringExtra("description");
        pageCount = getIntent().getIntExtra("pageCount", 0);
        genre = getIntent().getStringExtra("genre");


        // after getting the data we are setting
        // that data to our text views and image view.
        titleTV.setText(title);
        subtitleTV.setText(subtitle);
        publisherTV.setText(publisher);
        publishDateTV.setText("Published On : " + publishedDate);
        descTV.setText(description);
        pageTV.setText("No Of Pages : " + pageCount);



    }

    public void add(View view){
        lOB.read(getApplicationContext());
        ArrayList<Book> list = lOB.getBookList();
        list.add(new Book(login.id, title, subtitle, genre, description));
        lOB = new BookList(list);
        lOB.writeToFile(lOB, getApplicationContext());
        DynamicToast.makeSuccess(getApplicationContext(), title + " has been added").show();

    }
}
