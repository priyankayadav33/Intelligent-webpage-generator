document.addEventListener("DOMContentLoaded", () => {
    const form = document.getElementById("loginForm");

    if (form) {
        form.addEventListener("submit", async (e) => {
            e.preventDefault();

            const email = document.getElementById("email").value;
            const password = document.getElementById("password").value;

            try {
                const response = await fetch("/api/auth/login", {
                    method: "POST",
                    headers: { "Content-Type": "application/json" },
                    body: JSON.stringify({ email, password }),
                });

                if (response.ok) {
                    alert("Login successful!");

                    // Optionally store the email in localStorage or sessionStorage
                    localStorage.setItem("loggedInEmail", email);

                    // Redirect to profile
                    window.location.href = "/faculty-profile.html";
                } else {
                    document.getElementById("login-status").innerText = "Invalid credentials";
                }
            } catch (err) {
                console.error("Login error", err);
                document.getElementById("login-status").innerText = "Server error.";
            }
        });
    }
});
