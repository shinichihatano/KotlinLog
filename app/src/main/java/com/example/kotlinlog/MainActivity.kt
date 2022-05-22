package com.example.kotlinlog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import java.lang.Exception

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("kotlintest", "ログへの出力テスト")

        // 整数型の変数をnumという名前で作成して、10を代入する
        var num = 10
        Log.d("kotlintest", Integer.toString(num))

        // numに50を代入する
        // 変数や定数に .toString() と記述する方法もある
        num = 50
        Log.d("kotlintest", num.toString())

        val num1 = 10 + 5 - 2 * 4 / 2
        Log.d("kotlintest", "10 + 5 - 2  * 4 / 2 = " + num1)

        val flag1 = true
        val flag2 = false
        Log.d("kotlintest", "flag1 && flag2 = " + (flag1 && flag2))
        Log.d("kotlintest", "flag1 || flag2 = " + (flag1 || flag2))

        val num2 = 10
        val num3 = 20
        Log.d("kotlintest", "num2 < num3 = " + (num2 < num3))

        num = 60
        if (num >= 90) {
            Log.d("kotlintest", "優")
        } else if (num >= 75) {
            Log.d("kotlintest", "良")
        } else if (num >= 60) {
            Log.d("kotlintest", "可")
        } else {
            Log.d("kotlintest", "不可")
        }

        val drink = 1
        when (drink) {
            0 -> {
                Log.d("kotlintest", "コーヒーを注文しました")
            }
            1 -> Log.d("kotlintest", "紅茶を注文しました")
            2 -> Log.d("kotlintest", "ミルクを注文しました")
            else -> Log.d("kotlintest", "オーダーミスです")
        }

        //上記の別解答。なお、drinkは上記の条件式より代入される。
        val message = when (drink) {
            0 -> "コーヒーを注文しました"
            1 -> "紅茶を注文しました"
            2 -> "ミルクを注文しました"
            else -> "オーダーミスです。"
        }
        Log.d("kotlinetest", message)

        for (i in 0 until 10) {
            Log.d("kotlintest", Integer.toString(i))
        }

        var num4 = 0

        while (num4 < 10) {
            Log.d("kotlintest", Integer.toString(num4))
            num4++
        }

        //上記の別解答。判定を後から行う方法
        do {
            Log.d("kotlintest", Integer.toString(num4))
            num4++
        } while (num4 < 10)

        for (i in 1 until 6) {
            Log.d("kotlintest", "for文の" + i + "回目")
        }

        num = 1
        while (num < 6) {
            Log.d("kotlintest", "while文の" + num + "回目")
            num++
        }

        //for文の補足　downTo関数を使った方法。
        //1から3まで(3を含む)
        for (i in 1..3) {
            Log.d("kotlintest", "..演算子の" + i + "回目")
        }

        //6から2飛ばしずつ0まで
        for (i in 6 downTo 0 step 2) {
            Log.d("kotlintest", "downTo関数の" + i + "回目")
        }

        //配列
        // Array<Int>型の配列が作成される
        val points = arrayOf(10, 6, 15, 23, 17)
        for (i in points) {
            Log.d("kotlinteset", i.toString())
        }
        points.size
        Log.d("kotlintest", "要素の数は" + points + "です。")

        //インディックスプロパティを使用した場合
        for (i in points.indices) {
            Log.d("kotlintest", points[i].toString())
        }

        val numA = 100
        val numB = 0
        var ans = 0

        try {
            ans = numA / numB
        } catch (e: Exception) {
            Log.d("kotlintest", "0で割ろうとしました")
            //例外処理からメッセージを表示
            Log.d("kotlintest", e.message.toString())
        } finally {
            Log.d("kotlintest", "ans = " + ans.toString())
        }

        //total(50,1000)

        //total(1,1111)

        //val t = total(50,1000)
        //Log.d("kotlintest", t.toString())
    //}

    //private fun total(first:Int,last:Int): Int {
        //var sum = 0
        //for (i in first..last) {
            //sum += i
        //}

        //return sum

        //ラムダ式
        val z = {x: Int , y: Int -> x + y}(100,200)
        Log.d("kotlintest", z.toString())

        //無名関数
        val zz = fun(x: Int,y: Int):Int{return x + y}(100,200)
        Log.d("kotlintest", zz.toString())


        //クラスとインスタンス
        val dog = Dog("ポチ",3)
        dog.say()
        Log.d("kotlintest", "犬の名前は" + dog.name + "です。")
        Log.d("kotlintest", "犬の年齢は" + dog.age + "歳です。")

        val dog2 = Dog("ハチ",10)
        dog2.say()
        Log.d("kotlintest", "犬の名前は" + dog2.name + "です。")
        Log.d("kotlintest", "犬の年齢は" + dog2.age + "歳です。")

        val bigdog = BigDog("ヨーゼフ",15)
        bigdog.say()
        Log.d("kotlintest", "犬の名前は" + bigdog.name + "です。")
        Log.d("kotlintest", "犬の年齢は" + bigdog.age + "歳です。")

        val human = Human("A", 1,"B")
        val think = Human("C",2,"D")
        human.say()
        human.think()
        think.say()
        think.think()

        //Lesson 3Chapter 10.2 よく使うメソッド 文字列の比較
        val str1 = "Hello"
        val str2 = "World"
        val str3 = "Hello"

        if (str1.equals(str2)) {
            Log.d("kotlintest", "str1とstr2は一緒です")
        } else {
            Log.d("kotlintest", "str1とstr2は異なります")
        }

        if (str1.equals(str3)) {
            Log.d("kotlintest", "str1とstr3は一緒です")
        } else {
            Log.d("kotlintest", "str1とstr3は異なります")
        }

        //文字列テンプレート
        val i = 100
        val str = i.toString() + " * 100 = ${i * 100}"
            Log.d("kotlintest",str)

        //Lesson 3Chapter 11.4 リファレンス List
        //読み込み専用Listの作成
        val list = listOf(1,2,3)
        //list[0] = 5 //書き込みできない（エラーになる）

        //書き込み可能Mutablelistの作成
        val mulist = mutableListOf("A","B","C")
        mulist[0] = "X"
        // mulist[1] = 1 // 型が違うのでエラーになる

        //Map
        // 読み込み専用Mapの作成
        val map = mapOf(1 to "x", 2 to "y", -1 to "zz")
        // map[2] = "Y" // 書き込みできない（エラーになる）

        // 書き込み可能MutableMapの作成（型を指定した例）
        val mumap = mutableMapOf<String, Int>("A" to 100, "B" to 200, "C" to 300)
        mumap.put("D", 400)

        //Set
        // 読み込み専用Setの作成
        val set1 = setOf(1, 2, 3, 3) // 重複した要素は排除される
        val set2 = setOf(3, 2, 1)
        // 要素が一致しているのでtrueと表示される
        Log.d("kotlinlog", (set1 == set2).toString())

        // 書き込み可能MutableSetの作成
        val muset = mutableSetOf("A", "B", "C")
        muset.add("D")

    }
}