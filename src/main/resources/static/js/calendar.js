document.addEventListener("DOMContentLoaded", () => {
    const calendarElement = document.getElementById("calendar");

    if (!calendarElement || typeof FullCalendar === "undefined") {
        return;
    }

    const calendar = new FullCalendar.Calendar(calendarElement, {
        initialView: "dayGridMonth",
        locale: "ko",
        headerToolbar: {
            left: "prev,next today",
            center: "title",
            right: "dayGridMonth,timeGridWeek,timeGridDay"
        }
    });

    calendar.render();
});
