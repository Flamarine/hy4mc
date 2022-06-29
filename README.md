# Hy4MC

A Fabric mod to wrap SLF4J to use [HyLogger](https://github.com/HyDevelop/HyLogger).

Currently, it's not encouraged to use this in actual production environments, as HyLogger causes logs to stop being printed. However, it does make the log in dev environment much prettier.

To use it in dev, add this to your build.gradle:
```groovy
repositories {
	// [...]
	maven { url 'https://jitpack.io' }
}

dependencies {
	// [...]
	modImplementation "com.github.pkstDev:hy4mc:main-SNAPSPOT" // Since there's currently no public build yet
}
```
