import 'package:flutter/material.dart';
import 'package:flutter_app/mainScreen.dart';

void main() => runApp(MyApp());

class MyApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
        debugShowCheckedModeBanner: false,
        //calls the intro carousel
        home: MainScreen());
  }
}
