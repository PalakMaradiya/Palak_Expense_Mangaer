package com.example.khatabook.Activity

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.khatabook.R
import com.example.khatabook.databinding.ActivityHomeScreenBinding

class HomeScreenActivity : AppCompatActivity() {
    lateinit var binding: ActivityHomeScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initview()
    }

    private fun initview() {


        binding.nevView.setNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.calender -> {
                    val intent = Intent(this, calanderActivity::class.java)
                    startActivity(intent)
                }

                R.id.Home -> {
                    val intent = Intent(this, HomeScreenActivity::class.java)
                    startActivity(intent)
                }

                R.id.Category -> {
                    val intent = Intent(this, CategoryActivity::class.java)
                    startActivity(intent)
                }

                R.id.payment -> {
                    val intent = Intent(this, PaymentModeActivity::class.java)
                    startActivity(intent)
                }

                R.id.rate -> {

                    val intent = Intent(this, RateActivity::class.java)
                    startActivity(intent)
                }


                R.id.privacy -> {

                    val openurl = Intent(Intent.ACTION_VIEW)
                    openurl.data =
                        Uri.parse("https://www.google.com/search?q=javatpoint&oq=ja&aqs=chrome.1.69i57j35i39i650j0i131i433i512l2j46i131i433i512j69i60l3.119338j0j7&sourceid=chrome&ie=UTF-8")
                    startActivity(openurl)
                }

                R.id.shareApp -> {







                    val intent= Intent()
                    intent.action=Intent.ACTION_SEND
                    intent.putExtra(Intent.EXTRA_TEXT,"Hey Check out this Great app:"+ "https://play.google.com/store/apps/details?id=com.freeman.moneymanager")
                    intent.type="text/plain"
                    startActivity(Intent.createChooser(intent,"Share To:"))
                }


                R.id.termsofservice ->
                {



                    val openurl = Intent(Intent.ACTION_VIEW)
                    openurl.data =
                        Uri.parse("http://appworldinfotech.hol.es/terms/magneticlab/termsofservice.html")
                    startActivity(openurl)

                }

                R.id.feedback ->
                {



//                    val intent = Intent(Intent.ACTION_SEND)
//                    intent.type = "text/html"
//                    intent.putExtra(Intent.EXTRA_EMAIL, "palakmaradiya1594@gmail.com")
//                    intent.putExtra(Intent.EXTRA_SUBJECT, "For FeedBack")
//                    intent.putExtra(Intent.EXTRA_TEXT, "Share Your FeedBack About Your Experience")
//                    startActivity(Intent.createChooser(intent, "Send Email"))



//                    for open direct email
                    val intent = Intent(Intent.ACTION_VIEW, Uri.parse("mailto:" ))
                    intent.putExtra(Intent.EXTRA_SUBJECT, "For FeedBack ")
                    intent.putExtra(Intent.EXTRA_TEXT, "Share your Feedback About your Experience ")
                    startActivity(intent)


            }





            }
            true


        }

        binding.imgNaveview.setOnClickListener {

            binding.DrawerLayout.openDrawer(binding.nevView)
        }

        binding.DrawerLayout.setOnClickListener {
            binding.DrawerLayout.closeDrawer(binding.nevView)
        }

        binding.cardViewAddCategory.setOnClickListener {

            val i = Intent(this@HomeScreenActivity, CategoryActivity::class.java)
            startActivity(i)
        }
        binding.imgCalander.setOnClickListener {

            val i = Intent(this@HomeScreenActivity, calanderActivity::class.java)
            startActivity(i)
        }

        binding.imgPremium.setOnClickListener {

            val i = Intent(this@HomeScreenActivity, PreminumActivity::class.java)
            startActivity(i)
        }

        binding.cardviewAddincome.setOnClickListener {

            val i = Intent(this@HomeScreenActivity, IncomeActivity::class.java)
            startActivity(i)
        }

        binding.cardviewAddexpenses.setOnClickListener {

            val i = Intent(this@HomeScreenActivity, ExpenseActivity::class.java)
            startActivity(i)
        }



        binding.cardviewAddTransation.setOnClickListener {

            val i = Intent(this@HomeScreenActivity, AllTranasationActivity::class.java)
            startActivity(i)
        }


    }



}