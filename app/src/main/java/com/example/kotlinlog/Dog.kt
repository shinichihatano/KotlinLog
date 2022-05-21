package com.example.kotlinlog

import android.util.Log

open class Dog : Animal,Movable {
    //コンストラクタ(初期値)、引数とプロパティが同じ場合はプロパティの前に「this.」とつけて区別する
    constructor(name: String , age: Int,hobby: String): super(name, age,hobby){
    }

    //Animalクラスのメソッドをオーバーライド
    override fun say(){
        Log.d("kotlintest",this.name + "(" + this.age + "歳)「ワンワン」")
    }

    //Movableインターフェイスのメソッドをオーバーライド
    override fun move(){
        Log.d("kotlintest", this.name + "(" + this.age + "歳)" + "は全力で走った。")
    }
}