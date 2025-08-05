document.addEventListener("DOMContentLoaded", function () {
    const form = document.getElementById("facultyForm");
    const statusMessage = document.getElementById("statusMessage");

    // Optional: Pre-fill form if email exists
    const emailInput = document.getElementById("email");

    emailInput.addEventListener("blur", function () {
        const email = emailInput.value.trim();
        if (email !== "") {
            fetch(`/api/faculty?email=${encodeURIComponent(email)}`)
                .then(response => {
                    if (!response.ok) throw new Error("Profile not found");
                    return response.json();
                })
                .then(data => {
                    // Fill form with existing data
                    document.getElementById("name").value = data.name || "";
                    document.getElementById("designation").value = data.designation || "";
                    document.getElementById("department").value = data.department || "";
                    document.getElementById("scholarUrl").value = data.scholarUrl || "";
                    document.getElementById("linkedinUrl").value = data.linkedinUrl || "";
                    document.getElementById("interests").value = data.researchInterests || "";
                    document.getElementById("publications").value = data.publications || "";
                })
                .catch(() => {
                    statusMessage.textContent = "No existing profile found. You can create one.";
                    clearFormExceptEmail();
                });
        }
    });

    form.addEventListener("submit", function (e) {
        e.preventDefault();

        const data = {
            name: document.getElementById("name").value,
            designation: document.getElementById("designation").value,
            department: document.getElementById("department").value,
            email: document.getElementById("email").value,
            scholarUrl: document.getElementById("scholarUrl").value,
            linkedinUrl: document.getElementById("linkedinUrl").value,
            researchInterests: document.getElementById("interests").value,
            publications: document.getElementById("publications").value
        };

        fetch("/api/faculty", {
            method: "POST",
            headers: {
                "Content-Type": "application/json"
            },
            body: JSON.stringify(data)
        })
            .then(response => {
                if (!response.ok) throw new Error("Error saving profile");
                return response.text();
            })
            .then(message => {
                statusMessage.textContent = message;
            })
            .catch(error => {
                console.error(error);
                statusMessage.textContent = "Failed to update profile.";
            });
    });

    function clearFormExceptEmail() {
        document.getElementById("name").value = "";
        document.getElementById("designation").value = "";
        document.getElementById("department").value = "";
        document.getElementById("scholarUrl").value = "";
        document.getElementById("linkedinUrl").value = "";
        document.getElementById("interests").value = "";
        document.getElementById("publications").value = "";
    }
});
