# SquareLoader
# Live Preview
https://user-images.githubusercontent.com/46339440/123542272-59504180-d766-11eb-84df-d5c85345c399.mp4

----------
Step 1 : Add to project root build.gradle.(Project Gradle)
----------
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' } 
		}
	}
----------
Step 2 : Add the dependency.(Module Gradle)
----------
	dependencies {
	        implementation 'com.github.vsa15:SquareLoader:v1.0.0'
	}

----------
Step 3 : Add the XML Layout (Start,End and Backgound Gradient colors :red_circle: as per your choice :metal: )
----------
	<com.valencio.squareloaderanimation.SlidingSquareLoaderView
        android:id="@+id/slideLoader"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:sslv_background_color="#FFFFFF"
        app:sslv_corner_radius="10dp"
        app:sslv_end_gradient_color="#D81B60"
        app:sslv_margin="10dp"
        app:sslv_square_size="35dp"
        app:sslv_start_gradient_color="#FDD835" />

----------
Step 4 : Implementation in the code 💻
----------
	val loaderView = findViewById(R.id.slideLoader)
----------
Step 5 : To Start the loader 👇
----------
	 loaderView.show()
----------
Step 6 : To Stop/Hide the loader ⛔
----------
	loaderView.hide()
----------
NOTE : Add a slight delay if the Views take time to Load (Initially) ⏳
----------
	private fun timerFunction() {
        object : CountDownTimer(1000, 1000) {
            override fun onTick(millisUntilFinished: Long) {
            }

            override fun onFinish() {
                //call Step 5 here.
                
            }
        }.start()

    }
----------
