// document.addEventListener("DOMContentLoaded", () => {
//     const token = localStorage.getItem("token");

//     if (!token) {
//         alert("Please login first.");
//         window.location.href = "/login";
//         return;
//     }

//     fetch("/api/faculty/profile", {
//         headers: { "Authorization": "Bearer " + token }
//     })
//     .then(res => res.json())
//     .then(data => {
//         document.getElementById("name").value = data.name || "";
//         document.getElementById("designation").value = data.designation || "";
//         document.getElementById("department").value = data.department || "";
//         document.getElementById("email").value = data.email || "";
//         document.getElementById("scholarUrl").value = data.scholarUrl || "";
//         document.getElementById("linkedinUrl").value = data.linkedinUrl || "";
//         document.getElementById("interests").value = data.researchInterests || "";
//         document.getElementById("publications").value = data.publications || "";
//     });

//     document.getElementById("facultyForm").addEventListener("submit", (e) => {
//         e.preventDefault();

//         const payload = {
//             name: document.getElementById("name").value,
//             designation: document.getElementById("designation").value,
//             department: document.getElementById("department").value,
//             email: document.getElementById("email").value,
//             scholarUrl: document.getElementById("scholarUrl").value,
//             linkedinUrl: document.getElementById("linkedinUrl").value,
//             researchInterests: document.getElementById("interests").value,
//             publications: document.getElementById("publications").value,
//         };

//         fetch("/api/faculty/update", {
//             method: "POST",
//             headers: {
//                 "Content-Type": "application/json",
//                 "Authorization": "Bearer " + token
//             },
//             body: JSON.stringify(payload)
//         })
//         .then(res => {
//             if (res.ok) {
//                 document.getElementById("statusMessage").textContent = "Profile updated successfully!";
//             } else {
//                 document.getElementById("statusMessage").textContent = "Update failed.";
//             }
//         });
//     });
// });
document.getElementById("facultyForm").addEventListener("submit", async function (e) {
  e.preventDefault();

  const facultyData = {
    name: document.getElementById("name").value,
    designation: document.getElementById("designation").value,
    department: document.getElementById("department").value,
    email: document.getElementById("email").value,
    scholarUrl: document.getElementById("scholarUrl").value,
    linkedinUrl: document.getElementById("linkedinUrl").value,
    interests: document.getElementById("interests").value,
    publications: document.getElementById("publications").value,
  };

  try {
    const response = await fetch("http://localhost:8080/api/faculty", {
      method: "POST",
      headers: {
        "Content-Type": "application/json"
      },
      body: JSON.stringify(facultyData)
    });

    if (response.ok) {
      document.getElementById("statusMessage").innerText = "Profile updated successfully!";
    } else {
      const errorText = await response.text();
      document.getElementById("statusMessage").innerText = "Error: " + errorText;
    }
  } catch (error) {
    document.getElementById("statusMessage").innerText = "Error: " + error.message;
  }
});
