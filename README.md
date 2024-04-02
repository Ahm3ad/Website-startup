# Website-startup
Just a introduction website to introduce me to css  html and js

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ahmaads Portfolio</title>

    <link rel="stylesheet" href="index.css"> <!-- Links CSS file-->
    <script src="script.js" defer></script><!-- Links JS file-->
    <style>
        /* Define entrance animations */
        @keyframes fadeIn {
            from {
                opacity: 0;
                transform: translateY(20px);
            }
            to {
                opacity: 1;
                transform: translateY(0);
            }
        }

        @keyframes slideInFromLeft {
            from {
                opacity: 0;
                transform: translateX(-20px);
            }
            to {
                opacity: 1;
                transform: translateX(0);
            }
        }

        /* Apply entrance animations to specific elements */
        #AboutMe, #LinkToMyGitHub, #LinkToMyLinkedIn {
            animation: fadeIn 1s ease-out forwards;
        }

        /* Additional styles... */
    </style>
</head>
<body>

    <header>
        <h1>Welcome To my Website</h1>
        <nav>
            <ul>
                <li><a href="#AboutMe">About Me</a></li>
            </ul>
        </nav>
    </header>

    <main>

        <section id="AboutMe">
            <h2>About Me</h2>
            <p>My name is Ahmaad Riaz. I am currently pursuing a Bachelor's degree in Information Technology with a specialization in Networking and IT Security at Ontario Tech University. My focus areas include programming, networking, and cybersecurity. Through my academic journey and practical projects, I have developed valuable skills in coordinating project teams, conducting comprehensive website scans, and integrating cybersecurity standards into project designs. I have led various projects, such as coordinating a cybersecurity analyst project and overseeing research on drone technology for Enactus projects. With strong communication, teamwork, and problem-solving abilities, I am well-equipped to thrive in technical environments..</p>
            <!-- Links -->
            <a href="https://www.linkedin.com/in/ahmaad-riaz-a47771256">LinkedIn</a><br>
            <a href="https://github.com/Ahm3ad">GitHub</a><br>
        </section>


        <section id="Resume">
            <h2>Resume</h2>
            <embed src="AhmaadsResume.pdf" type="application/pdf" width="100%" height="600px" />
            </section>

        </section>

        

        <!-- Additional sections... -->

    </main>

    <footer>
        <p>&copy; 2024 Ahmaads website. All rights reserved.</p>
    </footer>
     
</body>
</html>
