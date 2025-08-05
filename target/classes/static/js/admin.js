function validatePassword() {
    const pass = document.getElementById("adminPassword").value;
    if (pass === "yourSecretPassword") {
        document.getElementById("adminPanel").style.display = "block";
    } else {
        alert("Incorrect password");
    }
}

async function loadTemplates() {
    try {
        const res = await fetch("http://localhost:8080/api/templates");
        if (!res.ok) throw new Error("Failed to load templates");

        const templates = await res.json();
        const container = document.getElementById("template-list");
        container.innerHTML = "";

        templates.forEach(t => {
            const div = document.createElement("div");
            div.className = "template-card";
            div.innerHTML = `
                <strong>Name:</strong> ${t.name}<br>
                <strong>Industry:</strong> ${t.industry}<br>
                <strong>Layout:</strong> ${t.layout}<br>
                <strong>Description:</strong> ${t.description}
            `;
            container.appendChild(div);
        });
    } catch (err) {
        console.error("Error loading templates:", err);
        document.getElementById("template-list").innerText = "Failed to load templates.";
    }
}
