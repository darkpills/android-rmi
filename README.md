# Android RMI

A working dirty port of OpenJDK17 RMI classes to Java Android from https://github.com/openjdk/jdk17

For a CTF ([BreizhCTF](https://www.breizhctf.com/)), a quick port of RMI client capabilities have been integrated into a Java Android Application.

Hope it can be usefull to someone one day. Don't hesitate to send me a message if so :)

## Install

Copy the content of `java` directory to your `app/src/main/java/` directory of your Android Application:

```shell
git clone https://github.com/darkpills/android-rmi
cp -r android-rmi/java/* <myApp>/app/src/main/java/
```

And that's it!

## Usage

Use it like classically suing Java RMI client:

```java
// create a registry
Registry registry = LocateRegistry.getRegistry("my-server-rmi.com", 1099);
service = (ServiceInterface) registry.lookup("RegistryName");

// call your remote method here
service.echo("Hello")
```

## Limitations and differences with OpenJDK

* String deserialisation uses `readObject()`
* Java Filtering has been removed or made ineffective: https://docs.oracle.com/en/java/javase/17/core/serialization-filtering1.html
* `java.io.ObjectInputFilter` have been renamed to `java.iox.ObjectInputFilter` because of conflicts with Android `java.io` package
* Heavily not tested, I provide no warranty of any sort
