# Generated by Django 2.2.5 on 2020-03-17 13:51

from django.db import migrations, models
import django.db.models.deletion
import django.utils.timezone


class Migration(migrations.Migration):

    dependencies = [
        ('engine', '0006_auto_20200222_1054'),
    ]

    operations = [
        migrations.AddField(
            model_name='task',
            name='plan_end_time',
            field=models.DateTimeField(blank=True, default=django.utils.timezone.now),
            preserve_default=False,
        ),
        migrations.AddField(
            model_name='task',
            name='plan_start_time',
            field=models.DateTimeField(blank=True, default=django.utils.timezone.now),
            preserve_default=False,
        ),
        migrations.AddField(
            model_name='task',
            name='task_type',
            field=models.SmallIntegerField(default=0),
            preserve_default=False,
        ),
        migrations.AlterField(
            model_name='task',
            name='finished_time',
            field=models.DateTimeField(auto_now=True),
        ),
        migrations.CreateModel(
            name='TaskItem',
            fields=[
                ('id', models.AutoField(auto_created=True, primary_key=True, serialize=False, verbose_name='ID')),
                ('content', models.CharField(max_length=255)),
                ('status', models.IntegerField(default=0)),
                ('active', models.BooleanField(default=True)),
                ('finished_time', models.DateTimeField(auto_now=True)),
                ('plan_time', models.DateTimeField(blank=True)),
                ('modified_time', models.DateTimeField(auto_now=True, verbose_name='修改时间')),
                ('created_time', models.DateTimeField(auto_now_add=True, verbose_name='创建时间')),
                ('task', models.ForeignKey(on_delete=django.db.models.deletion.CASCADE, to='engine.Task')),
            ],
            options={
                'db_table': 'engine_task_item',
            },
        ),
    ]