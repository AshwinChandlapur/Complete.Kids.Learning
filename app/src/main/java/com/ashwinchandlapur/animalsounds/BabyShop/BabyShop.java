package com.ashwinchandlapur.animalsounds.BabyShop;

import android.annotation.TargetApi;
import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

import com.ashwinchandlapur.animalsounds.BuildConfig;
import com.ashwinchandlapur.animalsounds.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

public class BabyShop extends AppCompatActivity {

    private WebView webView1,webView2,webView3,webView4,webView5;
    private WebView webView6,webView7,webView8,webView9,webView10;
    private WebView webView11,webView12,webView13,webView14,webView15;
    private WebView webView16,webView17,webView18,webView19,webView20;
    private WebView webView21,webView22,webView23,webView24,webView25;
    private WebView webView26,webView27,webView28,webView29,webView30;


    String p1="<iframe style=\"width:120px;height:240px;\" marginwidth=\"0\" marginheight=\"0\" scrolling=\"no\" frameborder=\"0\" src=\"https://ws-in.amazon-adsystem.com/widgets/q?ServiceVersion=20070822&OneJS=1&Operation=GetAdHtml&MarketPlace=IN&source=ss&ref=as_ss_li_til&ad_type=product_link&tracking_id=vadeworks-21&marketplace=amazon&region=IN&placement=B01J81HVOY&asins=B01J81HVOY&linkId=d6c340a9562272812e308f2ebc578bbd&show_border=true&link_opens_in_new_window=true\"></iframe>";
    //Gift
    String p2="<iframe style=\"width:120px;height:240px;\" marginwidth=\"0\" marginheight=\"0\" scrolling=\"no\" frameborder=\"0\" src=\"https://ws-in.amazon-adsystem.com/widgets/q?ServiceVersion=20070822&OneJS=1&Operation=GetAdHtml&MarketPlace=IN&source=ss&ref=as_ss_li_til&ad_type=product_link&tracking_id=vadeworks-21&marketplace=amazon&region=IN&placement=B00UVIU1PA&asins=B00UVIU1PA&linkId=7f98cfae1a17b381e4418241b11d7f01&show_border=true&link_opens_in_new_window=true\"></iframe>";
    //JohnSons SkinCare Wipes
    String p3="<iframe style=\"width:120px;height:240px;\" marginwidth=\"0\" marginheight=\"0\" scrolling=\"no\" frameborder=\"0\" src=\"https://ws-in.amazon-adsystem.com/widgets/q?ServiceVersion=20070822&OneJS=1&Operation=GetAdHtml&MarketPlace=IN&source=ss&ref=as_ss_li_til&ad_type=product_link&tracking_id=vadeworks-21&marketplace=amazon&region=IN&placement=B071XLYWLM&asins=B071XLYWLM&linkId=6a002fb69089092f0f0f8cb859b86700&show_border=true&link_opens_in_new_window=true\"></iframe>";
    //Pacifier
    String p4="<iframe style=\"width:120px;height:240px;\" marginwidth=\"0\" marginheight=\"0\" scrolling=\"no\" frameborder=\"0\" src=\"https://ws-in.amazon-adsystem.com/widgets/q?ServiceVersion=20070822&OneJS=1&Operation=GetAdHtml&MarketPlace=IN&source=ss&ref=as_ss_li_til&ad_type=product_link&tracking_id=vadeworks-21&marketplace=amazon&region=IN&placement=B0719J6329&asins=B0719J6329&linkId=4a68f54be0e4551ddc00bcea4b80dca9&show_border=true&link_opens_in_new_window=true\"></iframe>";
    //Diapers
    String p5="<iframe style=\"width:120px;height:240px;\" marginwidth=\"0\" marginheight=\"0\" scrolling=\"no\" frameborder=\"0\" src=\"https://ws-in.amazon-adsystem.com/widgets/q?ServiceVersion=20070822&OneJS=1&Operation=GetAdHtml&MarketPlace=IN&source=ss&ref=as_ss_li_til&ad_type=product_link&tracking_id=vadeworks-21&marketplace=amazon&region=IN&placement=B00BQYVQWU&asins=B00BQYVQWU&linkId=d786c6e91475299091897e107868ebb2&show_border=true&link_opens_in_new_window=true\"></iframe>";
    //Baby Camera


    String p6="<iframe style=\"width:120px;height:240px;\" marginwidth=\"0\" marginheight=\"0\" scrolling=\"no\" frameborder=\"0\" src=\"https://ws-in.amazon-adsystem.com/widgets/q?ServiceVersion=20070822&OneJS=1&Operation=GetAdHtml&MarketPlace=IN&source=ss&ref=as_ss_li_til&ad_type=product_link&tracking_id=vadeworks-21&marketplace=amazon&region=IN&placement=B00IHRL5OI&asins=B00IHRL5OI&linkId=a7866ee86b4222b561fb549fd6911799&show_border=true&link_opens_in_new_window=true\"></iframe>";
    //Stroller
    String p7="<iframe style=\"width:120px;height:240px;\" marginwidth=\"0\" marginheight=\"0\" scrolling=\"no\" frameborder=\"0\" src=\"https://ws-in.amazon-adsystem.com/widgets/q?ServiceVersion=20070822&OneJS=1&Operation=GetAdHtml&MarketPlace=IN&source=ss&ref=as_ss_li_til&ad_type=product_link&tracking_id=vadeworks-21&marketplace=amazon&region=IN&placement=B01N1YBAYS&asins=B01N1YBAYS&linkId=1de34c27e7587c228e59a6ba61c2cd3f&show_border=true&link_opens_in_new_window=true\"></iframe>";
    //Carrier
    String p8="<iframe style=\"width:120px;height:240px;\" marginwidth=\"0\" marginheight=\"0\" scrolling=\"no\" frameborder=\"0\" src=\"https://ws-in.amazon-adsystem.com/widgets/q?ServiceVersion=20070822&OneJS=1&Operation=GetAdHtml&MarketPlace=IN&source=ss&ref=as_ss_li_til&ad_type=product_link&tracking_id=vadeworks-21&marketplace=amazon&region=IN&placement=B07125NXFN&asins=B07125NXFN&linkId=78f770003bdb3bd680f52f07183a3824&show_border=true&link_opens_in_new_window=true\"></iframe>";
    //Rocker
    String p9="<iframe style=\"width:120px;height:240px;\" marginwidth=\"0\" marginheight=\"0\" scrolling=\"no\" frameborder=\"0\" src=\"https://ws-in.amazon-adsystem.com/widgets/q?ServiceVersion=20070822&OneJS=1&Operation=GetAdHtml&MarketPlace=IN&source=ss&ref=as_ss_li_til&ad_type=product_link&tracking_id=vadeworks-21&marketplace=amazon&region=IN&placement=B0000DEW8N&asins=B0000DEW8N&linkId=c296d71b39d6f11865945a40b121a4c7&show_border=true&link_opens_in_new_window=true\"></iframe>";
    //Seat for Kids
    String p10="<iframe style=\"width:120px;height:240px;\" marginwidth=\"0\" marginheight=\"0\" scrolling=\"no\" frameborder=\"0\" src=\"https://ws-in.amazon-adsystem.com/widgets/q?ServiceVersion=20070822&OneJS=1&Operation=GetAdHtml&MarketPlace=IN&source=ss&ref=as_ss_li_til&ad_type=product_link&tracking_id=vadeworks-21&marketplace=amazon&region=IN&placement=B07BPBD7S3&asins=B07BPBD7S3&linkId=522e488b84abe86f06afc70dc38c0ce3&show_border=true&link_opens_in_new_window=true\"></iframe>";
    //Bike Carrier


    String p11="<iframe style=\"width:120px;height:240px;\" marginwidth=\"0\" marginheight=\"0\" scrolling=\"no\" frameborder=\"0\" src=\"https://ws-in.amazon-adsystem.com/widgets/q?ServiceVersion=20070822&OneJS=1&Operation=GetAdHtml&MarketPlace=IN&source=ss&ref=as_ss_li_til&ad_type=product_link&tracking_id=vadeworks-21&marketplace=amazon&region=IN&placement=B07BNQF63X&asins=B07BNQF63X&linkId=39f314bbb102581009a41074a51f27af&show_border=true&link_opens_in_new_window=true\"></iframe>";
    //Barbie
    String p12="<iframe style=\"width:120px;height:240px;\" marginwidth=\"0\" marginheight=\"0\" scrolling=\"no\" frameborder=\"0\" src=\"https://ws-in.amazon-adsystem.com/widgets/q?ServiceVersion=20070822&OneJS=1&Operation=GetAdHtml&MarketPlace=IN&source=ss&ref=as_ss_li_til&ad_type=product_link&tracking_id=vadeworks-21&marketplace=amazon&region=IN&placement=B01L7688JU&asins=B01L7688JU&linkId=0c1b1f6fc6a8fc23ae1fcc53f09bcc46&show_border=true&link_opens_in_new_window=true\"></iframe>";
    //Bike
    String p13="<iframe style=\"width:120px;height:240px;\" marginwidth=\"0\" marginheight=\"0\" scrolling=\"no\" frameborder=\"0\" src=\"https://ws-in.amazon-adsystem.com/widgets/q?ServiceVersion=20070822&OneJS=1&Operation=GetAdHtml&MarketPlace=IN&source=ss&ref=as_ss_li_til&ad_type=product_link&tracking_id=vadeworks-21&marketplace=amazon&region=IN&placement=B00004YRPE&asins=B00004YRPE&linkId=8b70c593df78d2834c5489701ecd7d7c&show_border=true&link_opens_in_new_window=true\"></iframe>";
    //Hotwheels
    String p14="<iframe style=\"width:120px;height:240px;\" marginwidth=\"0\" marginheight=\"0\" scrolling=\"no\" frameborder=\"0\" src=\"https://ws-in.amazon-adsystem.com/widgets/q?ServiceVersion=20070822&OneJS=1&Operation=GetAdHtml&MarketPlace=IN&source=ss&ref=as_ss_li_til&ad_type=product_link&tracking_id=vadeworks-21&marketplace=amazon&region=IN&placement=B079YR369H&asins=B079YR369H&linkId=2b57eb2a1c9704d7c1dfd6e139cdd278&show_border=true&link_opens_in_new_window=true\"></iframe>";
    //Pretne and Play
    String p15="<iframe style=\"width:120px;height:240px;\" marginwidth=\"0\" marginheight=\"0\" scrolling=\"no\" frameborder=\"0\" src=\"https://ws-in.amazon-adsystem.com/widgets/q?ServiceVersion=20070822&OneJS=1&Operation=GetAdHtml&MarketPlace=IN&source=ss&ref=as_ss_li_til&ad_type=product_link&tracking_id=vadeworks-21&marketplace=amazon&region=IN&placement=B000051ZKZ&asins=B000051ZKZ&linkId=33bcbe2dba0a27700582948b1f5479da&show_border=true&link_opens_in_new_window=true\"></iframe>";
    //Scrabble

    String p16="<iframe style=\"width:120px;height:240px;\" marginwidth=\"0\" marginheight=\"0\" scrolling=\"no\" frameborder=\"0\" src=\"https://ws-in.amazon-adsystem.com/widgets/q?ServiceVersion=20070822&OneJS=1&Operation=GetAdHtml&MarketPlace=IN&source=ss&ref=as_ss_li_til&ad_type=product_link&tracking_id=vadeworks-21&marketplace=amazon&region=IN&placement=B01GPJWUG6&asins=B01GPJWUG6&linkId=71b1af6cb607969fb04b0af04064f9ec&show_border=true&link_opens_in_new_window=true\"></iframe>";
    //Bheem Shirt
    String p17="<iframe style=\"width:120px;height:240px;\" marginwidth=\"0\" marginheight=\"0\" scrolling=\"no\" frameborder=\"0\" src=\"https://ws-in.amazon-adsystem.com/widgets/q?ServiceVersion=20070822&OneJS=1&Operation=GetAdHtml&MarketPlace=IN&source=ss&ref=as_ss_li_til&ad_type=product_link&tracking_id=vadeworks-21&marketplace=amazon&region=IN&placement=B079X65DKM&asins=B079X65DKM&linkId=7b361f5c74ba763e1bf8af26d4180353&show_border=true&link_opens_in_new_window=true\"></iframe>";
    //Gini Maxi
    String p18="<iframe style=\"width:120px;height:240px;\" marginwidth=\"0\" marginheight=\"0\" scrolling=\"no\" frameborder=\"0\" src=\"https://ws-in.amazon-adsystem.com/widgets/q?ServiceVersion=20070822&OneJS=1&Operation=GetAdHtml&MarketPlace=IN&source=ss&ref=as_ss_li_til&ad_type=product_link&tracking_id=vadeworks-21&marketplace=amazon&region=IN&placement=B079YJH449&asins=B079YJH449&linkId=bf503e64374ab5658dc2e14715b089c5&show_border=true&link_opens_in_new_window=true\"></iframe>";
    //Gini Shirt and Short
    String p19="<iframe style=\"width:120px;height:240px;\" marginwidth=\"0\" marginheight=\"0\" scrolling=\"no\" frameborder=\"0\" src=\"https://ws-in.amazon-adsystem.com/widgets/q?ServiceVersion=20070822&OneJS=1&Operation=GetAdHtml&MarketPlace=IN&source=ss&ref=as_ss_li_til&ad_type=product_link&tracking_id=vadeworks-21&marketplace=amazon&region=IN&placement=B079Z5WWQT&asins=B079Z5WWQT&linkId=e51e67ec0f2b3b4c03c065e6590543c3&show_border=true&link_opens_in_new_window=true\"></iframe>";
    //Lehenga
    String p20="<iframe style=\"width:120px;height:240px;\" marginwidth=\"0\" marginheight=\"0\" scrolling=\"no\" frameborder=\"0\" src=\"https://ws-in.amazon-adsystem.com/widgets/q?ServiceVersion=20070822&OneJS=1&Operation=GetAdHtml&MarketPlace=IN&source=ss&ref=as_ss_li_til&ad_type=product_link&tracking_id=vadeworks-21&marketplace=amazon&region=IN&placement=B074F3HMBN&asins=B074F3HMBN&linkId=4e63e28171a20c5284b6c697f47585b9&show_border=true&link_opens_in_new_window=true\"></iframe>";
    //Nightwear


    String p21="<iframe style=\"width:120px;height:240px;\" marginwidth=\"0\" marginheight=\"0\" scrolling=\"no\" frameborder=\"0\" src=\"https://ws-in.amazon-adsystem.com/widgets/q?ServiceVersion=20070822&OneJS=1&Operation=GetAdHtml&MarketPlace=IN&source=ss&ref=as_ss_li_til&ad_type=product_link&tracking_id=vadeworks-21&marketplace=amazon&region=IN&placement=B01N35JFBP&asins=B01N35JFBP&linkId=517431905fbeb8583ed1d8da477a44b2&show_border=true&link_opens_in_new_window=true\"></iframe>";
    //Bag
    String p22="<iframe style=\"width:120px;height:240px;\" marginwidth=\"0\" marginheight=\"0\" scrolling=\"no\" frameborder=\"0\" src=\"https://ws-in.amazon-adsystem.com/widgets/q?ServiceVersion=20070822&OneJS=1&Operation=GetAdHtml&MarketPlace=IN&source=ss&ref=as_ss_li_til&ad_type=product_link&tracking_id=vadeworks-21&marketplace=amazon&region=IN&placement=B004OFBY0M&asins=B004OFBY0M&linkId=a3caa7bca91444b7d8f43fd4c403a0e2&show_border=true&link_opens_in_new_window=true\"></iframe>";
    //Coloring Book
    String p23="<iframe style=\"width:120px;height:240px;\" marginwidth=\"0\" marginheight=\"0\" scrolling=\"no\" frameborder=\"0\" src=\"https://ws-in.amazon-adsystem.com/widgets/q?ServiceVersion=20070822&OneJS=1&Operation=GetAdHtml&MarketPlace=IN&source=ss&ref=as_ss_li_til&ad_type=product_link&tracking_id=vadeworks-21&marketplace=amazon&region=IN&placement=B00LPD51SC&asins=B00LPD51SC&linkId=eb9e8f0d244044db0f9d02274cdbe902&show_border=true&link_opens_in_new_window=true\"></iframe>";
    //Crayons
    String p24="<iframe style=\"width:120px;height:240px;\" marginwidth=\"0\" marginheight=\"0\" scrolling=\"no\" frameborder=\"0\" src=\"https://ws-in.amazon-adsystem.com/widgets/q?ServiceVersion=20070822&OneJS=1&Operation=GetAdHtml&MarketPlace=IN&source=ss&ref=as_ss_li_til&ad_type=product_link&tracking_id=vadeworks-21&marketplace=amazon&region=IN&placement=B07B7PVLQ5&asins=B07B7PVLQ5&linkId=25c1517473f68d3b36f7c3085a0e37ea&show_border=true&link_opens_in_new_window=true\"></iframe>";
    //Lunch Bag
    String p25="<iframe style=\"width:120px;height:240px;\" marginwidth=\"0\" marginheight=\"0\" scrolling=\"no\" frameborder=\"0\" src=\"https://ws-in.amazon-adsystem.com/widgets/q?ServiceVersion=20070822&OneJS=1&Operation=GetAdHtml&MarketPlace=IN&source=ss&ref=as_ss_li_til&ad_type=product_link&tracking_id=vadeworks-21&marketplace=amazon&region=IN&placement=B07CSJRQ7X&asins=B07CSJRQ7X&linkId=b0da47b76548816a69c5573bc76e69d4&show_border=true&link_opens_in_new_window=true\"></iframe>";


    String p26="<iframe style=\"width:120px;height:240px;\" marginwidth=\"0\" marginheight=\"0\" scrolling=\"no\" frameborder=\"0\" src=\"https://ws-in.amazon-adsystem.com/widgets/q?ServiceVersion=20070822&OneJS=1&Operation=GetAdHtml&MarketPlace=IN&source=ss&ref=as_ss_li_til&ad_type=product_link&tracking_id=vadeworks-21&marketplace=amazon&region=IN&placement=B00QJDOEAO&asins=B00QJDOEAO&linkId=34aaf293c8ffa726e3481e169147397d&show_border=true&link_opens_in_new_window=true\"></iframe>";
    //Kindle
    String p27="<iframe style=\"width:120px;height:240px;\" marginwidth=\"0\" marginheight=\"0\" scrolling=\"no\" frameborder=\"0\" src=\"https://ws-in.amazon-adsystem.com/widgets/q?ServiceVersion=20070822&OneJS=1&Operation=GetAdHtml&MarketPlace=IN&source=ss&ref=as_ss_li_til&ad_type=product_link&tracking_id=vadeworks-21&marketplace=amazon&region=IN&placement=B075BCSFNN&asins=B075BCSFNN&linkId=2bad138445dac72e29bd873457858bba&show_border=true&link_opens_in_new_window=true\"></iframe>";
    //Mi Band
    String p28="<iframe style=\"width:120px;height:240px;\" marginwidth=\"0\" marginheight=\"0\" scrolling=\"no\" frameborder=\"0\" src=\"https://ws-in.amazon-adsystem.com/widgets/q?ServiceVersion=20070822&OneJS=1&Operation=GetAdHtml&MarketPlace=IN&source=ss&ref=as_ss_li_til&ad_type=product_link&tracking_id=vadeworks-21&marketplace=amazon&region=IN&placement=B0725W7Q38&asins=B0725W7Q38&linkId=dcc604a62e85f80d2e0543cb87787a27&show_border=true&link_opens_in_new_window=true\"></iframe>";
    //Echo
    String p29="<iframe style=\"width:120px;height:240px;\" marginwidth=\"0\" marginheight=\"0\" scrolling=\"no\" frameborder=\"0\" src=\"https://ws-in.amazon-adsystem.com/widgets/q?ServiceVersion=20070822&OneJS=1&Operation=GetAdHtml&MarketPlace=IN&source=ss&ref=as_ss_li_til&ad_type=product_link&tracking_id=vadeworks-21&marketplace=amazon&region=IN&placement=B072LPF91D&asins=B072LPF91D&linkId=aa133e1d477ccc52a5212022936dea70&show_border=true&link_opens_in_new_window=true\"></iframe>";
    //Iphone
    String p30="<iframe style=\"width:120px;height:240px;\" marginwidth=\"0\" marginheight=\"0\" scrolling=\"no\" frameborder=\"0\" src=\"https://ws-in.amazon-adsystem.com/widgets/q?ServiceVersion=20070822&OneJS=1&Operation=GetAdHtml&MarketPlace=IN&source=ss&ref=as_ss_li_til&ad_type=product_link&tracking_id=vadeworks-21&marketplace=amazon&region=IN&placement=B0756Z43QS&asins=B0756Z43QS&linkId=67e35824e39bbdaa075d045bf7134c08&show_border=true&link_opens_in_new_window=true\"></iframe>";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_baby_shop);


        webView1 =  (WebView) findViewById(R.id.p1);
        wvSetting(webView1,p1);

        webView2 =  (WebView) findViewById(R.id.p2);
        wvSetting(webView2,p2);

        webView3 =  (WebView) findViewById(R.id.p3);
        wvSetting(webView3,p3);

        webView4 =  (WebView) findViewById(R.id.p4);
        wvSetting(webView4,p4);

        webView5 =  (WebView) findViewById(R.id.p5);
        wvSetting(webView5,p5);

        webView6 =  (WebView) findViewById(R.id.p6);
        wvSetting(webView6,p6);

        webView6 =  (WebView) findViewById(R.id.p6);
        wvSetting(webView6,p6);

        webView7 =  (WebView) findViewById(R.id.p7);
        wvSetting(webView7,p7);

        webView8 =  (WebView) findViewById(R.id.p8);
        wvSetting(webView8,p8);

        webView9 =  (WebView) findViewById(R.id.p9);
        wvSetting(webView9,p9);

        webView10 =  (WebView) findViewById(R.id.p10);
        wvSetting(webView10,p10);

        webView11 =  (WebView) findViewById(R.id.p11);
        wvSetting(webView11,p11);

        webView12 =  (WebView) findViewById(R.id.p12);
        wvSetting(webView12,p12);

        webView13 =  (WebView) findViewById(R.id.p13);
        wvSetting(webView13,p13);

        webView14 =  (WebView) findViewById(R.id.p14);
        wvSetting(webView14,p14);

        webView15 =  (WebView) findViewById(R.id.p15);
        wvSetting(webView15,p15);

        webView16 =  (WebView) findViewById(R.id.p16);
        wvSetting(webView16,p16);

        webView17 =  (WebView) findViewById(R.id.p17);
        wvSetting(webView17,p17);

        webView18 =  (WebView) findViewById(R.id.p18);
        wvSetting(webView18,p18);

        webView19 =  (WebView) findViewById(R.id.p19);
        wvSetting(webView19,p19);

        webView20 =  (WebView) findViewById(R.id.p20);
        wvSetting(webView20,p20);

        webView21 =  (WebView) findViewById(R.id.p21);
        wvSetting(webView21,p21);

        webView22 =  (WebView) findViewById(R.id.p22);
        wvSetting(webView22,p22);

        webView23 =  (WebView) findViewById(R.id.p23);
        wvSetting(webView23,p23);

        webView24 =  (WebView) findViewById(R.id.p24);
        wvSetting(webView24,p24);

        webView25 =  (WebView) findViewById(R.id.p25);
        wvSetting(webView25,p25);

        webView26 =  (WebView) findViewById(R.id.p26);
        wvSetting(webView26,p26);

        webView27 =  (WebView) findViewById(R.id.p27);
        wvSetting(webView27,p27);

        webView28 =  (WebView) findViewById(R.id.p28);
        wvSetting(webView28,p28);

        webView29 =  (WebView) findViewById(R.id.p29);
        wvSetting(webView29,p29);

        webView30 =  (WebView) findViewById(R.id.p30);
        wvSetting(webView30,p30);


        
        
        

    }

    public void wvSetting(WebView wv,String product){
        WebSettings ws = wv.getSettings();
        ws.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
        ws.setPluginState(WebSettings.PluginState.ON);
        ws.setJavaScriptEnabled(true);
        wv.setScrollContainer(false);
        wv.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                return (event.getAction() == MotionEvent.ACTION_MOVE);
            }
        });
        wv.reload();
        wv.loadData(product, "text/html", "UTF-8");
    }



}
