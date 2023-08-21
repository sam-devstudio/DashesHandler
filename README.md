# DashesHandler

### An utility for your Android Project to solve the problem of adding Dashes or any desired character in an EditText field

#### Key Features
##### 1 - Delete handling of Dashes
##### 2 - Copy Paste Handling of Dashes
##### 3 - Configurable number of Characters 

## _How to use_

#### Add the following in Project level gradle

```Kotlin
 maven { url 'https://jitpack.io' }
```

#### Add the following in app level gradle
```Kotlin
implementation 'com.github.saqibmirza2007:DashesHandler:1.0.1'
```

#### Now in your Kotlin Activity/Fragment file with the EditText reference 

```Kotlin
//Et is the EditText reference, Use your reference id
et.addDashes()
```

_And here the magic happens_
