// College Event Website JavaScript

// Smooth scrolling for navigation links
document.querySelectorAll('nav a').forEach(link => {
    link.addEventListener('click', function (e) {
        e.preventDefault();

        const target = document.querySelector(this.getAttribute('href'));

        target.scrollIntoView({
            behavior: 'smooth'
        });
    });
});

// Registration Form Validation
const form = document.getElementById("registrationForm");

form.addEventListener("submit", function (event) {

    event.preventDefault();

    const name = document.getElementById("name").value.trim();
    const email = document.getElementById("email").value.trim();
    const college = document.getElementById("college").value.trim();

    if (name === "" || email === "" || college === "") {

        alert("Please fill all the fields.");

        return;
    }

    alert(
        "Registration Successful!\n\n" +
        "Name : " + name +
        "\nEmail : " + email +
        "\nCollege : " + college
    );

    form.reset();

});

// Highlight active menu while scrolling
const sections = document.querySelectorAll("section");
const navLinks = document.querySelectorAll("nav ul li a");

window.addEventListener("scroll", () => {

    let current = "";

    sections.forEach(section => {

        const sectionTop = section.offsetTop - 120;

        if (pageYOffset >= sectionTop) {

            current = section.getAttribute("id");

        }

    });

    navLinks.forEach(link => {

        link.classList.remove("active");

        if (link.getAttribute("href") === "#" + current) {

            link.classList.add("active");

        }

    });

});

// Welcome Message
window.onload = function () {

    console.log("Welcome to College Technical Symposium 2026");

};

// Back to Top Button
const topButton = document.createElement("button");

topButton.innerHTML = "↑";

topButton.id = "topBtn";

document.body.appendChild(topButton);

topButton.style.position = "fixed";
topButton.style.bottom = "20px";
topButton.style.right = "20px";
topButton.style.padding = "10px 15px";
topButton.style.fontSize = "18px";
topButton.style.display = "none";
topButton.style.cursor = "pointer";
topButton.style.border = "none";
topButton.style.borderRadius = "50%";
topButton.style.background = "#1565c0";
topButton.style.color = "white";

window.addEventListener("scroll", function () {

    if (document.documentElement.scrollTop > 200) {

        topButton.style.display = "block";

    } else {

        topButton.style.display = "none";

    }

});

topButton.addEventListener("click", function () {

    window.scrollTo({

        top: 0,

        behavior: "smooth"

    });

});