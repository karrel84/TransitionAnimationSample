package karrel.com.transitionainmationsample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import android.support.v4.app.ActivityOptionsCompat
import android.content.Intent
import android.os.Build
import android.support.annotation.RequiresApi


class MainActivity : AppCompatActivity() {

    @RequiresApi(Build.VERSION_CODES.JELLY_BEAN)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        helloKitty.setOnClickListener {
            val intent = Intent(this, Main2Activity::class.java)
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
// Pass data object in the bundle and populate details activity.
                val options = ActivityOptionsCompat.makeSceneTransitionAnimation(this, it, it.transitionName)
                startActivity(intent, options.toBundle())
            } else {
                startActivity(intent)
            }

        }
    }
}
